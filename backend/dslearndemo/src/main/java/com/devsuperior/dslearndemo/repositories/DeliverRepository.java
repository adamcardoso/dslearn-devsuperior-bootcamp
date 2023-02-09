package com.devsuperior.dslearndemo.repositories;

import com.devsuperior.dslearndemo.entities.Deliver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliverRepository extends JpaRepository<Deliver, Long> {
}
