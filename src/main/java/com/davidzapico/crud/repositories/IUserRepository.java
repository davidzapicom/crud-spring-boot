package com.davidzapico.crud.repositories;

import org.springframework.stereotype.Repository;
import com.davidzapico.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {
    
}
