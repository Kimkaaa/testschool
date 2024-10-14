package com.my.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {

    @GetMapping("home")
    public String showMain(){
        return "main";
    }

    @GetMapping("showStudent")
    public String showStudent(Model model){
        return "showStudent";
    }

    @GetMapping("insetExam")
    public String insetExam(){
        return "insetExam";
    }

    @GetMapping("showExam")
    public String showExam(){
        return "showExam";
    }
}
