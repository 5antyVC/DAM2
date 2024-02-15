package com.example.SpeakSmart.repositories;

import com.example.SpeakSmart.models.levels;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface levelsRepository extends JpaRepository <levels, Long> {

        public Optional<levels> findById(Long id);

    
}
