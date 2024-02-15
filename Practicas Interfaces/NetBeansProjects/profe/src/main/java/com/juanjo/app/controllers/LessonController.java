/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanjo.app.controllers;

import com.juanjo.app.models.Lesson;
import com.juanjo.app.repositories.LessonRepository;
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
@RequestMapping("/api/lessons")
public class LessonController {
    @Autowired
    private LessonRepository lessonRepository;
    
    @CrossOrigin
    @GetMapping
    public List<Lesson> getAllLessons(){
        return lessonRepository.findAll();
    }
    
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Lesson> getLessonById(@PathVariable Long id){
        Optional<Lesson> lesson = lessonRepository.findById(id);
        return lesson.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @CrossOrigin
    @PostMapping()
    public ResponseEntity <Lesson> createLesson(@RequestBody Lesson lesson){
        Lesson savedLesson = lessonRepository.save(lesson);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedLesson);
    }
    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLesson(@PathVariable Long id){
        if (!lessonRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        lessonRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Lesson> updateLesson(@PathVariable Long id, @RequestBody Lesson updatedLesson){
        if (!lessonRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        
        updatedLesson.setId(id);
        Lesson savedLesson= lessonRepository.save(updatedLesson);
        return ResponseEntity.ok(savedLesson);
    }
            
    
    
}
