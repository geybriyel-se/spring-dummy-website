package com.geybriyel.businessappmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @GetMapping("/loginPage")
    public String showLoginPage() {
        return "login-form";
    }

    @RequestMapping("accessDenied")
    public String showAccessDenied() {
        return "access-denied";
    }
}
