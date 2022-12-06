package com.example.thymeleaf_project.controller;

import ch.qos.logback.core.model.Model;
import com.example.thymeleaf_project.model.Programmer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @GetMapping("/home")
   public String homePage(){
        System.out.println("homepage called");
        return "home";
   }
    @PostMapping("/addProgrammer")
   public ModelAndView addProgrammer(@ModelAttribute Programmer programmer){
      //System.out.println(pId+ " "+ pName + " " + pLanguage);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("programmerInfo");

        return mv;
   }
   @GetMapping("/allProgrammer")
   public String allProgrammer(Model m){
       List<Programmer> p = new ArrayList<Programmer>();
       p.add(new Programmer(1001, "Rahman", "Java"));
       p.add(new Programmer(1002, "Mohammad", "C#"));
       p.add(new Programmer(1003, "Selim", "Spring"));
       
       m.addAttribute("Programmers", p);
       

     return "allProgrammer";
   }
}
