package com.example.SpeakSmart.repositories;

import com.example.SpeakSmart.models.users;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usersRepository extends JpaRepository<users, Long> {

    public Optional<users> findById(Long id);

    
    
}
