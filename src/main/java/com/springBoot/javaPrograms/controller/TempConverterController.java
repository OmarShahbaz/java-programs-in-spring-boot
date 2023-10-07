package com.springBoot.javaPrograms.controller;

import com.springBoot.javaPrograms.service.TempConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/temp")
@RestController
public class TempConverterController {

    @Autowired
    TempConverter tempConverter;

    @GetMapping("/fahrenheit-to-centigrade/{temp}")
    double fahrenheitToCentigrade(@PathVariable int temp){
        return tempConverter.fahrenheitToCentigrade(temp);
    }

    @GetMapping("/centigrade-to-fahrenheit")
    double centigradeToFahrenheit(@PathVariable int temp){
        return tempConverter.CentigradeToFahrenheit(temp);
    }
}