package com.classup.api.repository;

import com.classup.api.models.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository <Classroom, Long> {
}
