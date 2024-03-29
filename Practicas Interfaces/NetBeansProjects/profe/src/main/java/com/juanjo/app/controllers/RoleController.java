/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanjo.app.controllers;

import com.juanjo.app.models.Role;
import com.juanjo.app.repositories.RoleRepository;
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
@RequestMapping("/api/roles")
public class RoleController {
    @Autowired
    private RoleRepository roleRepository;
    
    @CrossOrigin
    @GetMapping
    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }
    
    
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Role> getCategoryById(@PathVariable Long id){
        Optional<Role> role = roleRepository.findById(id);
        return role.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        
    }
    
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Role> createRole(@RequestBody Role role){
        Role savedRole = roleRepository.save(role);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRole);
    }
    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRole(@PathVariable Long id){
        if (!roleRepository.existsById(id)) {
               return ResponseEntity.notFound().build();
            
        }
        roleRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Role> updateRole(@PathVariable Long id, @RequestBody Role updatedRole){
        if (!roleRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        updatedRole.setId(id);
        Role savedRole = roleRepository.save(updatedRole);
        return ResponseEntity.ok(savedRole);
    }
}
