package com.ProgradSpringApp.SpringDemoApp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/helloWorld")
    public String hii(){
        return "Hii! How are you?";
    }
}
