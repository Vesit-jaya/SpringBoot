package com.learn.webproj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @RequestMapping("/about")
    public String about()
    {
        return "I am about Spring MVC";
    }
}
