package com.spring.trainwithme.service.impl;

import com.spring.trainwithme.domain.Program;
import com.spring.trainwithme.repos.ProgramRepo;
import com.spring.trainwithme.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramServiceImpl implements ProgramService {

    @Autowired
    private ProgramRepo programRepo;

    @Override
    public List<Program> getByUserId(Long userId){
        return programRepo.findByUserId(userId);
    }

    @Override
    public void save(Program program) {
        programRepo.save(program);
    }
}
