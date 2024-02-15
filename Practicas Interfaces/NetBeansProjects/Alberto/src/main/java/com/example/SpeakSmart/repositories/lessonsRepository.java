package com.example.SpeakSmart.repositories;

import com.example.SpeakSmart.models.lessons;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface lessonsRepository extends JpaRepository<lessons, Long> {

    
        public Optional<lessons> findById(Long id);

}
