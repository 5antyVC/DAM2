/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanjo.app.controllers;

import com.juanjo.app.models.Permission;
import com.juanjo.app.repositories.PermissionRepository;
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
@RequestMapping("/api/permissions")
public class PermissionController {
    @Autowired
    private PermissionRepository permissionRepository;
    
    @CrossOrigin
    @GetMapping
    public List<Permission> getAllPermissions(){
        return permissionRepository.findAll();
    }
    
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Permission> getPermissionById(@PathVariable Long id){
        Optional<Permission> permission = permissionRepository.findById(id);
        return permission.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Permission> createPermission(@RequestBody Permission permission){
        Permission savedPermission = permissionRepository.save(permission);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPermission);
    }
    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePermission(@PathVariable Long id){
        if (!permissionRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        permissionRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Permission> updatePermission(@PathVariable Long id, @RequestBody Permission updatedPermission){
        if (!permissionRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        updatedPermission.setId(id);
        Permission savedPermission = permissionRepository.save(updatedPermission);
        return ResponseEntity.ok(savedPermission);
    }
    
}
