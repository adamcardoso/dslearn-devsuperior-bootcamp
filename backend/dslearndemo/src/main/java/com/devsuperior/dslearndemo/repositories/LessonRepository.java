package com.devsuperior.dslearndemo.repositories;

import com.devsuperior.dslearndemo.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
