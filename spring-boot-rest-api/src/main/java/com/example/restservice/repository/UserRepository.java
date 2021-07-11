package com.example.restservice.repository;

import com.example.restservice.models.user.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User,  Long> {

    List<User> findByRegid(String regid);
    List<User> findByFnameContaining(String fname);


}
