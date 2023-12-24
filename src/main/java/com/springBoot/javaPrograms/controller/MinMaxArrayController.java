package com.springBoot.javaPrograms.controller;

import com.springBoot.javaPrograms.service.MinMaxArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/array")
public class MinMaxArrayController {

    @Autowired
    MinMaxArray minMaxArray;

    @GetMapping("/max")
    int getMaxValue(){
        return minMaxArray.max();
    }

    @GetMapping("/min")
    int getMinValue(){
        return minMaxArray.min();
    }
}
