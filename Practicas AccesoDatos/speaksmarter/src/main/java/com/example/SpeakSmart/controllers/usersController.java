package com.example.SpeakSmart.controllers;

import com.example.SpeakSmart.models.users;
import com.example.SpeakSmart.repositories.usersRepository;
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
@RequestMapping("/api/users") //Es un  nombre, no una carpeta
public class usersController {

    @Autowired
    private usersRepository usersRepository;

    @GetMapping
    public List<users> getAllusers() {
        return usersRepository.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<users> getUserById(@PathVariable Long id) {
        Optional<users> user = usersRepository.findById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<users> createUser(@RequestBody users user) {
        users savedUsers = usersRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUsers);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        /*if (usersRepository.existsById(id)) {
            usersRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } 
       else{
        return ResponseEntity.notFound().build(); 
        }*/
        if (!usersRepository.existsById(id)) { //Patron Guarda, es al reves
            return ResponseEntity.notFound().build();

        }

        usersRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<users> UpdateUser(@PathVariable Long id, @RequestBody users updatedUser) {
        if (!usersRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        } 
            updatedUser.setId(id);
            users savedUser = usersRepository.save(updatedUser);
        return ResponseEntity.ok(savedUser);

    }
}
