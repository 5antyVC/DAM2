package com.example.SpeakSmart.controllers;

import com.example.SpeakSmart.models.permissions;
import com.example.SpeakSmart.repositories.permissionsRepository;
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
public class permissionsController {

    @Autowired
    private permissionsRepository permissionsRepository;

    @GetMapping
    public List<permissions> getAllpermissions() {
        return permissionsRepository.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<permissions> getPermissionsById(@PathVariable Long id) {
        Optional<permissions> permission = permissionsRepository.findById(id);
        return permission.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<permissions> createPermission(@RequestBody permissions permission) {
        permissions savedPermissions = permissionsRepository.save(permission);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPermissions);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePermissions(@PathVariable Long id) {
        /*if (usersRepository.existsById(id)) {
            usersRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } 
       else{
        return ResponseEntity.notFound().build(); 
        }*/
        if (!permissionsRepository.existsById(id)) { //Patron Guarda, es al reves
            return ResponseEntity.notFound().build();

        }

        permissionsRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<permissions> UpdatePermissions(@PathVariable Long id, @RequestBody permissions updatedPermissionsr) {
        if (!permissionsRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        } 
            updatedPermissionsr.setId(id);
            permissions savedPermission = permissionsRepository.save(updatedPermissionsr);
        return ResponseEntity.ok(savedPermission);

    }
}
