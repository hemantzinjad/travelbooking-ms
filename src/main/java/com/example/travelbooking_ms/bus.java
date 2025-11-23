package com.example.travelbooking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class bus {
    @GetMapping("/mybus")
    public String getData() {
        return "please book your bus tickets from red bus from air india";
    }
}

