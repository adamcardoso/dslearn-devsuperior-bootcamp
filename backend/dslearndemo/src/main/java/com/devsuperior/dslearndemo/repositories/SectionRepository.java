package com.devsuperior.dslearndemo.repositories;

import com.devsuperior.dslearndemo.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
