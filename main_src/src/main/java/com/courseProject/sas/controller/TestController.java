package com.courseProject.sas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("message", "Hello Codders of team StormBreakers.Everyone is ready!!! Insha Allah we will go something good this time too");
        return "login"; // This should match the login.html template name
    }
}