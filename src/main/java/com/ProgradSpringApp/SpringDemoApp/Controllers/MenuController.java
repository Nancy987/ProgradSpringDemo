package com.ProgradSpringApp.SpringDemoApp.Controllers;

import com.ProgradSpringApp.SpringDemoApp.Menu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MenuController {
    @GetMapping("/menu")
    public List<Menu> menuDetails(){
        List<Menu> menu = new ArrayList<>();
        menu.add(new Menu("Burger",150));
        menu.add(new Menu("Grilled Sandwich",70));
        menu.add(new Menu("Pizza",300));
        menu.add(new Menu("Paneer Dosa",170));
        menu.add(new Menu("Momos",80));
        menu.add(new Menu("Chowmein",120));
        return menu;
    }
}
