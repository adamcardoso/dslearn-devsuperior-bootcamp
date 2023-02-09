package com.devsuperior.dslearndemo.repositories;

import com.devsuperior.dslearndemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
