package com.devsuperior.dslearndemo.repositories;

import com.devsuperior.dslearndemo.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
