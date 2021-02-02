package com.lsh.actuator.controller;

import com.lsh.actuator.metrics.ComplexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private ComplexService complexService;

    @RequestMapping("/hello")
    public String hello(){
        complexService.increment();
        return "hello";
    }
}
