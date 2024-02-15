package com.example.SpeakSmart.controllers;

import com.example.SpeakSmart.models.roles;
import com.example.SpeakSmart.repositories.rolesRepository;
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
@RequestMapping("/api/roles") //Es un  nombre, no una carpeta
public class rolesController {

    @Autowired
    private rolesRepository rolesRepository;

    @GetMapping
    public List<roles> getAllroles() {
        return rolesRepository.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<roles> getRolById(@PathVariable Long id) {
        Optional<roles> rol = rolesRepository.findById(id);
        return rol.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<roles> createRol(@RequestBody roles rol) {
        roles savedRoles = rolesRepository.save(rol);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRoles);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRol(@PathVariable Long id) {
        /*if (usersRepository.existsById(id)) {
            usersRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } 
       else{
        return ResponseEntity.notFound().build(); 
        }*/
        if (!rolesRepository.existsById(id)) { //Patron Guarda, es al reves
            return ResponseEntity.notFound().build();

        }

        rolesRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<roles> UpdateRol(@PathVariable Long id, @RequestBody roles updatedRol) {
        if (!rolesRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        } 
            updatedRol.setId(id);
            roles savedUser = rolesRepository.save(updatedRol);
        return ResponseEntity.ok(savedUser);

    }
}
