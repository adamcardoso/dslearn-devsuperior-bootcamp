package com.devsuperior.dslearndemo.repositories;

import com.devsuperior.dslearndemo.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
