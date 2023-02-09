package com.devsuperior.dslearndemo.repositories;

import com.devsuperior.dslearndemo.entities.Enrollment;
import com.devsuperior.dslearndemo.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
