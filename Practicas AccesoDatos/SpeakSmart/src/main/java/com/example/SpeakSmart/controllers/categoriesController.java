package com.example.SpeakSmart.controllers;

import com.example.SpeakSmart.models.categories;
import com.example.SpeakSmart.repositories.categoriesRepository;
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
@RequestMapping("/api/categories") //Es un  nombre, no una carpeta
public class categoriesController {

    @Autowired
    private categoriesRepository categoriesRepository;

    @GetMapping
    public List<categories> getAllCategories() {
        return categoriesRepository.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<categories> getCategoryById(@PathVariable Long id) {
        Optional<categories> category = categoriesRepository.findById(id);
        return category.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<categories> createCategory(@RequestBody categories category) {
        categories savedCategory = categoriesRepository.save(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        /*if (usersRepository.existsById(id)) {
            usersRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } 
       else{
        return ResponseEntity.notFound().build(); 
        }*/
        if (!categoriesRepository.existsById(id)) { //Patron Guarda, es al reves
            return ResponseEntity.notFound().build();

        }

        categoriesRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<categories> UpdateCategory(@PathVariable Long id, @RequestBody categories updatedCategory) {
        if (!categoriesRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        } 
            updatedCategory.setId(id);
            categories savedCategory = categoriesRepository.save(updatedCategory);
        return ResponseEntity.ok(savedCategory);

    }
}
