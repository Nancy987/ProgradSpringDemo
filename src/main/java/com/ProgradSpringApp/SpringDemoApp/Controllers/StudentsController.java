package com.ProgradSpringApp.SpringDemoApp.Controllers;

import com.ProgradSpringApp.SpringDemoApp.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {
    @GetMapping("/students")
    public Students[] studentDetails(){
        Students student[] = new Students[5];
        student[0] = new Students("Nancy","Mangla");
        student[1] = new Students("Charu","Gupta");
        student[2] = new Students("Ritika","Arora");
        student[3] = new Students("Mayank","Mangla");
        student[4] = new Students("Harshit","Aggarwal");
        return student;
    }
}
