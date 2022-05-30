package com.spring.trainwithme.repos;

import com.spring.trainwithme.domain.ProgramComposition;
import com.spring.trainwithme.domain.ProgramCompositionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramCompositionRepo extends JpaRepository<ProgramComposition, ProgramCompositionId> {

}
