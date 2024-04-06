package com.davidzapico.crud.controllers;
import org.springframework.web.bind.annotation.RestController;
import com.davidzapico.crud.services.UserService;
import com.davidzapico.crud.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;


@RestController("/users")
// @RequestMapping
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping
    public ArrayList<UserModel> getUsers() {
        return this.userService.getUsers();
    }
    
}
