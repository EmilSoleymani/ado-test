package com.example.adotest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/services")
public class ServicesController {

    @GetMapping
    public List<String> getServicesList() {
        return Arrays.asList("Web Design", "Backend", "Cloud Services");
    }
}
