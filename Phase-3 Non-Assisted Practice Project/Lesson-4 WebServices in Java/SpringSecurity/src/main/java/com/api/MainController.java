package com.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hello User, Welcome to Spring Boot Academy";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hello admin, Welcome to the admin control panel";
    }

}
