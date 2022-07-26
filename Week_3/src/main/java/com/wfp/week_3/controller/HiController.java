package com.wfp.week_3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${developer.name}")
    private String devName;

    @RequestMapping("/hi")
    public String sayHi() {
        return "hi ";
    }
}
