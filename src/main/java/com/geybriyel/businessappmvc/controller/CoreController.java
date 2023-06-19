package com.geybriyel.businessappmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoreController {
    @GetMapping("/")
    public String showHome() {
        return "home";
    }
}
