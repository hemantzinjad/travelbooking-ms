package com.example.travelbooking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holidaypackage {
    @GetMapping("/goa")
    public String getData() {
        return "please book your hotel & flight tickets";
    }
}
