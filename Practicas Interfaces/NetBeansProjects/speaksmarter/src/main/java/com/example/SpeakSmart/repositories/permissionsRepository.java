package com.example.SpeakSmart.repositories;

import com.example.SpeakSmart.models.permissions;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface permissionsRepository extends JpaRepository<permissions, Long> {

        public Optional<permissions> findById(Long id);

    
}
