package com.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    

    @GetMapping("/test")
    public String displayName(){
        String message = "Hello, World!";
        return message;
    }

}
