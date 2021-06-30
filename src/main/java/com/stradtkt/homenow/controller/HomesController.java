package com.stradtkt.homenow.controller;

import com.stradtkt.homenow.model.Home;
import com.stradtkt.homenow.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomesController {
    @Autowired
    private HomeService homeService;

    @RequestMapping("/add-home")
    public String addHome(Model model) {
        Home theHome = new Home();
        model.addAttribute("home", theHome);
        return "homes/add-home";
    }
    @GetMapping("/homes")
    public String homes(Model model) {
        List<Home> homes = homeService.findAll();
        model.addAttribute("homes", homes);
        return "homes/homes";
    }
}
