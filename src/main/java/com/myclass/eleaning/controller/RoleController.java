package com.myclass.eleaning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/role")
public class RoleController {
    @GetMapping
    public String index(){
        return "role/role-index";
    }
    @GetMapping("/add")
    public String add(){
        return "role/role-add";
    }
}
