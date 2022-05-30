package com.spring.trainwithme.controllers;

import com.spring.trainwithme.domain.Exercise;
import com.spring.trainwithme.domain.Program;
import com.spring.trainwithme.domain.ProgramComposition;
import com.spring.trainwithme.domain.User;
import com.spring.trainwithme.repos.ExerciseRepo;
import com.spring.trainwithme.service.impl.ProgramCompositionServiceImpl;
import com.spring.trainwithme.service.impl.ProgramServiceImpl;
import com.spring.trainwithme.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/diary")
public class DiaryController {

    @Autowired
    private ProgramServiceImpl programService;

    @Autowired
    private UserService userService;

    @Autowired
    private ProgramCompositionServiceImpl programCompositionService;

    @Autowired
    private ExerciseRepo exerciseRepo;

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
    public String programConstructor(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("username", auth.getName());
        Set<String> muscles = new LinkedHashSet<>();
        for (Exercise exercise : exerciseRepo.findAll()) {
            muscles.add(exercise.getMuscles());
        }
        model.addAttribute("exercises", exerciseRepo.findAll());
        model.addAttribute("muscles", muscles);
        return "addProgram";
    }

    @PostMapping("/addProgram")
    public String addProgram(@ModelAttribute Program program,
                             @ModelAttribute ProgramComposition programComposition) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User userFromDb = userService.loadUserByUsername(auth.getName());


        program.setPhotoURL("/img/card-photo-1.png");
        program.setProgramComposition(Collections.singletonList(programComposition));
        program.setUser(userFromDb);
//        program.setId((long) 5);

        programService.save(program);
//        programComposition.setProgramId(program.getId());
//        programComposition.setProgram(program);
//        programCompositionService.save(programComposition);
        return "addProgram";
    }


}
