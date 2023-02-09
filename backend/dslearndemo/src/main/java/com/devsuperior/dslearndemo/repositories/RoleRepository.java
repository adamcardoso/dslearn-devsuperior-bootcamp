package com.devsuperior.dslearndemo.repositories;

import com.devsuperior.dslearndemo.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
