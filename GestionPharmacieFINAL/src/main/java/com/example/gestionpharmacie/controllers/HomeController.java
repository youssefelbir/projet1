package com.example.gestionpharmacie.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@AllArgsConstructor
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Home";
    }
}
