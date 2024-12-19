package com.springbootacademy.point_of_sale.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/test")
public class TestController {
    @GetMapping("/get-text-1")
    public String getMyText(){
        String myText = "Costomer 1";
        System.out.println(myText);
        return myText;
    }
    @GetMapping("/get-text-2")
    public String getMyText1(){
        String myText = "Costomer 2";
        System.out.println(myText);
        return myText;
    }
}



