package com.stradtkt.homenow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/about")
    public String about() {
        return "home/about";
    }
    @RequestMapping("/contact")
    public String contact() {
        return "home/contact";
    }

    @RequestMapping("/privacy-policy")
    public String privacyPolicy() {
        return "home/privacy-policy";
    }

}
