package com.small.cloud.microservicesimpleporvideruser.controller;

import com.small.cloud.microservicesimpleporvideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.small.cloud.microservicesimpleporvideruser.repository.UserRepository;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        return this.userRepository.findById(id).orElse(null);
    }
}
