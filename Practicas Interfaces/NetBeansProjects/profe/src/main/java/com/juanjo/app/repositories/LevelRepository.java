/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.juanjo.app.repositories;

import com.juanjo.app.models.Level;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author Hp
 */
public interface LevelRepository extends JpaRepository<Level, Long>{
    
}
