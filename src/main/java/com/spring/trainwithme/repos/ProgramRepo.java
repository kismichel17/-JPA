package com.spring.trainwithme.repos;

import com.spring.trainwithme.domain.Program;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgramRepo extends JpaRepository<Program, Long> {

    List<Program> findByUserId(Long userId);
//    Program find
}
