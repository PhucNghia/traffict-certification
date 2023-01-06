package com.traffic.certification.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class InitProject {
    @GetMapping("")
    public String startProject() {
        return "Hello Traffic Certification!";
    }

    @GetMapping("/docker")
    public String getMessage() {
        return "Hello from Docker!";
    }
}
