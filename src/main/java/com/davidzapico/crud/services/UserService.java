package com.davidzapico.crud.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidzapico.crud.models.UserModel;
import com.davidzapico.crud.repositories.IUserRepository;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public void findUser() {
        
    }

    public void updateUser() {
        userRepository.save(null);
    }

    public void deleteUser() {
        userRepository.delete(null);
    }
    
}
