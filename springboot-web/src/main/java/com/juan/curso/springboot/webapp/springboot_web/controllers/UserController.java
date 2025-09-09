package com.juan.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.juan.curso.springboot.webapp.springboot_web.models.User;



@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Juan Carlos", "Ortiz");
        model.addAttribute("title", "Hola Mundo!");
        model.addAttribute("user", user);
        

        return "details";
    }



}
