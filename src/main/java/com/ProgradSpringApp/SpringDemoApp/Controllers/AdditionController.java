package com.ProgradSpringApp.SpringDemoApp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {
    @GetMapping("/addition")
    public String addition(){
        int a = 40;
        int b = 50;
        int c = a+b;
        return "Addition of "+a+" and "+b+" is "+c;
    }
    @GetMapping("/multiplication")
    public String multiplication(){
        int a = 40;
        int b = 50;
        int c = a*b;
        return "Multiplication of "+a+" and "+b+" is "+c;
    }
}
