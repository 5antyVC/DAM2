/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.juanjo.app.controllers;

import com.juanjo.app.models.Level;
import com.juanjo.app.repositories.LevelRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hp
 */
@RestController
@RequestMapping("/api/levels")
public class LevelController {
    @Autowired
    private LevelRepository levelRepository;
    
    @CrossOrigin
    @GetMapping
    public List <Level> getAllLevels(){
        return levelRepository.findAll();
    }
    
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Level> getLevelById(@PathVariable Long id){
        Optional<Level> level = levelRepository.findById(id);
        return level.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Level> createLevel(@RequestBody Level level){
        Level savedLevel = levelRepository.save(level);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedLevel);
    }
    
    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLevel(@PathVariable Long id){
        if (!levelRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
            
        }
        levelRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Level> updateLevel(@PathVariable Long id, @RequestBody Level updatedLevel){
        if (!levelRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        updatedLevel.setId(id);
        Level savedLevel = levelRepository.save(updatedLevel);
        return ResponseEntity.ok(savedLevel);
    }
    
    
    
    
    
    
}
