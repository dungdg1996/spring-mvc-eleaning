package com.myclass.eleaning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/video")
public class VideoController {
    @GetMapping
    public String index(){
        return "video/video-index";
    }
    @GetMapping("/add")
    public String add(){
        return "video/video-add";
    }
}
