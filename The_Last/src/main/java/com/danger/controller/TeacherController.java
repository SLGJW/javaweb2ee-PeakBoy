package com.danger.controller;

import com.danger.domain.Teacher;
import com.danger.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Teacher> teachers = teacherService.findAll();
        mv.setViewName("main");
        mv.addObject("teachers", teachers);
        return mv;
    }
}
