package com.example.SpeakSmart.controllers;

import com.example.SpeakSmart.models.lessons;
import com.example.SpeakSmart.repositories.lessonsRepository;
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
@RequestMapping("/api/lessons") //Es un  nombre, no una carpeta
public class lessonsController {

    @Autowired
    private lessonsRepository lessonsRepository;

    @GetMapping
    public List<lessons> getAlllessons() {
        return lessonsRepository.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<lessons> getLessonById(@PathVariable Long id) {
        Optional<lessons> lesson = lessonsRepository.findById(id);
        return lesson.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<lessons> createLesson(@RequestBody lessons lesson) {
        lessons savedLesson = lessonsRepository.save(lesson);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedLesson);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLesson(@PathVariable Long id) {
        /*if (usersRepository.existsById(id)) {
            usersRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } 
       else{
        return ResponseEntity.notFound().build(); 
        }*/
        if (!lessonsRepository.existsById(id)) { //Patron Guarda, es al reves
            return ResponseEntity.notFound().build();

        }

        lessonsRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<lessons> UpdateLesson(@PathVariable Long id, @RequestBody lessons updatedLesson) {
        if (!lessonsRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        } 
            updatedLesson.setId(id);
            lessons savedCategory = lessonsRepository.save(updatedLesson);
        return ResponseEntity.ok(savedCategory);

    }
}
