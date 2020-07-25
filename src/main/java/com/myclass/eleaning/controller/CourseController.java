package com.myclass.eleaning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {
    @GetMapping
    public String index(){
        return "course/course-index";
    }
    @GetMapping("/add")
    public String add(){
        return "course/course-add";
    }
}
