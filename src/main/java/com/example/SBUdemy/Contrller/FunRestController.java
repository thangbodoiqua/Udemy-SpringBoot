package com.example.SBUdemy.Contrller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }
    @GetMapping("/workout")
    public String work(){
        return "Im working out";
    }
}
