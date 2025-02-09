package com.example.demo.note;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Note {
    @GetMapping("/hello")
    public String Note(){
        return "Hello World";
    }

}