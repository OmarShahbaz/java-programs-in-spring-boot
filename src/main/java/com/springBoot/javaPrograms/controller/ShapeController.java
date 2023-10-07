package com.springBoot.javaPrograms.controller;

import com.springBoot.javaPrograms.service.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shapes")
public class ShapeController {
    @Autowired
    Shape shape;

    @RequestMapping(value = "/right-triangle", method = RequestMethod.GET)
    private void rightTriangle(){
        shape.rightTriangle();
    }

    @RequestMapping(value = "/right-triangle-mirrored", method = RequestMethod.GET)
    private int rightTriangleMirrored(){
        shape.rightTriangleMirrored();
        return 0;
    }
    @GetMapping(value = "/right-triangle-mirrored-inverted")
    private String rightTriangleInverted(){
        shape.rightTriangleInverted();
        return "Right Triangle Inverted";
    }
    @GetMapping("/right-Triangle-Inverted-Flipped")
    private void rightTriangleInvertedFlipped(){
        shape.rightTriangleInvertedFlipped();
    }
    @GetMapping("/diamond")
    private void diamond(){
        shape.diamond();
    }
    @GetMapping("/square")
    private void square(){
        shape.square();
    }
    @GetMapping("/rectangle")
    private void rectangle(){
        shape.rectangle();
    }
}