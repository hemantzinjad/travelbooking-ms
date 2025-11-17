package com.example.travelbooking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visa {
    @GetMapping("/myvisa")
    public String getData() {
        return "H1b for us is delayed";
    }
}
