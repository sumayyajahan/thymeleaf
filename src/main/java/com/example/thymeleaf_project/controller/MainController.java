package com.example.thymeleaf_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/home")
   public String homePage(){
        System.out.println("homepage called");
       return "home";
   }
    @RequestMapping("/addProgrammer")
   public String addProgrammer(){
      return "";
   }
}
