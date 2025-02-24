package com.example.githubschmithub.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    public HelloController() {
        //this.helloService = helloService;
    }

    @GetMapping("/welcome")
    public String getHello() {
        return "hello";
    }
}
