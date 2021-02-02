package com.lsh.actuator.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Timed
public class MyController {

    @GetMapping("/api/people")
    @Timed(extraTags = {"region", "us-east-1"})
    @Timed(value = "all.people", longTask = true)
    public String listPeople() {
        return "test";
    }

}
