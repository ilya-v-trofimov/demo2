package com.example.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping
    public String index(){
        return "HELLO, MY FIRST SPRINGBOOT APP!!!!!!!!!!!!10";
    }
}
