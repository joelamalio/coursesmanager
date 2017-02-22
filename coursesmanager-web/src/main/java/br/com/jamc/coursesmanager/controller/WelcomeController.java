package br.com.jamc.coursesmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
    
    @RequestMapping("/test")
    public String test() {
        return "test";
    }

}
