package com.spring.trainwithme.controllers;

import com.spring.trainwithme.domain.Program;
import com.spring.trainwithme.domain.User;
import com.spring.trainwithme.repos.ProgramRepo;
import com.spring.trainwithme.service.impl.ProgramServiceImpl;
import com.spring.trainwithme.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/diary")
public class DiaryController {

    @Autowired
    private ProgramServiceImpl programService;

    @Autowired
    private UserService userService;



    @GetMapping
    public String training(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        User userFromDb = userService.loadUserByUsername(auth.getName());
        if (userFromDb != null) {
            List<Program> program = programService.getByUserId(userFromDb.getId());
            model.addAttribute("program", program);
        }
        model.addAttribute("username", auth.getName());
        return "diaryMain";
    }

    @GetMapping("/addProgram")
    public String addProgram(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();


        model.addAttribute("username", auth.getName());
        return "addProgram";
    }

}
