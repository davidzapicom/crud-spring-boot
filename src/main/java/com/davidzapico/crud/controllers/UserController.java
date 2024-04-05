package com.davidzapico.crud.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController("/users")
public class UserController {
    
    @GetMapping()
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
