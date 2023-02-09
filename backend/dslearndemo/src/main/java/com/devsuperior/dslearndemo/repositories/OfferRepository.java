package com.devsuperior.dslearndemo.repositories;

import com.devsuperior.dslearndemo.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
