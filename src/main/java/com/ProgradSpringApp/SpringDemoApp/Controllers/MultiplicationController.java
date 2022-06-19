package com.ProgradSpringApp.SpringDemoApp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicationController {
    @GetMapping("/Multiplication")
    public String multiplication(){
        int a = 40;
        int b = 80;
        int c = a*b;
        return "Multiplication of "+a+" and "+b+" is "+c;
    }
}
