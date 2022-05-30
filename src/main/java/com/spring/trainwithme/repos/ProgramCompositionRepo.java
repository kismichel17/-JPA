package com.spring.trainwithme.repos;

import com.spring.trainwithme.domain.ProgramComposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramCompositionRepo extends JpaRepository<ProgramComposition, Long> {
}
