package com.tiara.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    @GetMapping("/all")
    public String home() {
        return "index"; // returns /WEB-INF/jsp/index.jsp
    }
}
