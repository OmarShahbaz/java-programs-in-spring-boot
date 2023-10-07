package com.springBoot.javaPrograms.controller;

import com.springBoot.javaPrograms.service.Numbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/numbers")
public class NumbersController {

    @Autowired
    Numbers numbers;

    @GetMapping("/get-till/{limit}")
    List<Number> getNumbers(@PathVariable int limit){
        return numbers.getAllNumbers(limit);
    }

    @GetMapping("/get-whole/{limit}")
    List getWholeNumbers(@PathVariable int limit){
        return numbers.getWholeNumbers(limit);
    }

    @GetMapping("/get-even/{limit}")
    List getEvenNumbers(@PathVariable int limit){
        return numbers.getEvenNumbers(limit);
    }

    @GetMapping("/get-odd/{limit}")
    List getOddNumbers(@PathVariable int limit){
        return numbers.getOddNumbers(limit);
    }


}
