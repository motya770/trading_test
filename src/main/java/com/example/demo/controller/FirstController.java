package com.example.demo.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    //test
    @GetMapping(value = "/test")
    public String test(){
        return "walla!";
    }

}
