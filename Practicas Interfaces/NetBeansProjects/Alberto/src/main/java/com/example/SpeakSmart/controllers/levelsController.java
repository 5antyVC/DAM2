package com.example.SpeakSmart.controllers;

import com.example.SpeakSmart.models.levels;
import com.example.SpeakSmart.repositories.levelsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/levels") //Es un  nombre, no una carpeta
public class levelsController {

    @Autowired
    private levelsRepository levelsRepository;

    @GetMapping
    public List<levels> getAlllevels() {
        return levelsRepository.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<levels> getLevelById(@PathVariable Long id) {
        Optional<levels> level = levelsRepository.findById(id);
        return level.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<levels> createLevel(@RequestBody levels level) {
        levels savedLevel = levelsRepository.save(level);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedLevel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLevel(@PathVariable Long id) {
        /*if (usersRepository.existsById(id)) {
            usersRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } 
       else{
        return ResponseEntity.notFound().build(); 
        }*/
        if (!levelsRepository.existsById(id)) { //Patron Guarda, es al reves
            return ResponseEntity.notFound().build();

        }

        levelsRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<levels> UpdateLevel(@PathVariable Long id, @RequestBody levels updatedLevel) {
        if (!levelsRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        } 
            updatedLevel.setId(id);
            levels savedLevel = levelsRepository.save(updatedLevel);
        return ResponseEntity.ok(savedLevel);

    }
}
