package com.ProgradSpringApp.SpringDemoApp.Controllers;

import com.ProgradSpringApp.SpringDemoApp.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class StudentController {
    @GetMapping("/student")
    @ResponseBody
    public Students studentDetails(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname ){
        return new Students(firstname,lastname);
    }

    //studentDetails("Nancy","Mangla");
}
