package com.spring.trainwithme.repos;

import com.spring.trainwithme.domain.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseRepo extends JpaRepository<Exercise, Long> {
    List<Exercise> findExerciseById(Long id);
}
