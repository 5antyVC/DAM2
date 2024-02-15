package com.example.SpeakSmart.repositories;

import com.example.SpeakSmart.models.roles;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface rolesRepository extends JpaRepository<roles, Long> {

        public Optional<roles> findById(Long id);

    
}
