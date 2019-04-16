package com.example.feignconsumer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {

    @RequestMapping("index")
    public String index(Model model) {

        model.addAttribute("MMM", "DDD");

        return "index";
    }
}
