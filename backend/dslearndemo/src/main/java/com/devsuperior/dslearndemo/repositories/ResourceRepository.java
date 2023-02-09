package com.devsuperior.dslearndemo.repositories;

import com.devsuperior.dslearndemo.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
