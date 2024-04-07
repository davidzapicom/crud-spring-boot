package com.davidzapico.crud.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.davidzapico.crud.services.UserService;
import com.davidzapico.crud.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

// import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.Optional;

@RestController("/users")
// @RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ArrayList<UserModel> getUsers() {
        return this.userService.getUsers();
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUser(@PathVariable Long id) {
        return this.userService.getUserById(id);
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }

    @PutMapping(path = "/{id}")
    public UserModel updateUser(@RequestBody UserModel user, @PathVariable Long id) {
        return this.userService.updateUser(user, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable Long id) {
        boolean ok = this.userService.deleteUser(id);

        if (ok) {
            return "User with " + id + " deleted.";
        }
        return "Error: User with " + id + " not deleted.";
    }
}
