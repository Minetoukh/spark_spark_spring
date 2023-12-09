package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonControleur {

    @GetMapping("/monchemin")
    public String maMethode() {
        return "Bonjour, monde!";
    }
}
