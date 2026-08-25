package com.example.newproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Reels {

    @GetMapping("/reels")
    public String getList() {
        return "List of Raj";
    }


}
