package com.nicolasprojectweb.userdpt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicolasprojectweb.userdpt.entities.User;
import com.nicolasprojectweb.userdpt.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }

    /**
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public User findbyId(@PathVariable Long id){
        final User result = repository.findById(id).get();
        return result;

    
}
    @PostMapping
    public User insert(@RequestBody User user){
        final User result = repository.save(user);
        return result;

}

}

    