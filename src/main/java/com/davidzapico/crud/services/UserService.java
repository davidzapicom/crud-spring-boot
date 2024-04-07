package com.davidzapico.crud.services;

import java.util.ArrayList;
import java.util.Optional;
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

    public Optional<UserModel> getUserById(Long id) {
        return this.userRepository.findById(id);
    }

    public UserModel saveUser(UserModel user) {
        return this.userRepository.save(user);
    }

    public UserModel updateUser(UserModel request, Long id) {
        UserModel user = this.userRepository.findById(id).get();

        user.setName(request.getName());
        user.setLastName(request.getLastName());

        return user;
    }

    public Boolean deleteUser(Long id) {
        try {
            this.userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
