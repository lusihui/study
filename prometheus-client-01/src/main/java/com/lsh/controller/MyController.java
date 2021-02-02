package com.lsh.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/api/people")
    public String listPeople() throws InterruptedException {
        Thread.sleep(1000);
        return "test";
    }

}
