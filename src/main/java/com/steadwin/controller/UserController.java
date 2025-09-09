package com.steadwin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steadwin.entity.UserData;
import com.steadwin.service.CustomerService;

@RestController
@RequestMapping("api/fetchdata")
public class UserController {
    
    private final CustomerService customerService;

    public UserController(CustomerService customerService){
        this.customerService = customerService;
    }

    @RequestMapping
    public List<UserData> getAllUsers(){
        return customerService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<UserData> getUserById(@PathVariable Long id) {
        return customerService.getUserById(id);
    }

    @PostMapping
    public UserData CreateUserData(@RequestBody UserData userData){
        return customerService.saveUserData(userData);
    }

    @PutMapping("/{id}")
    public UserData updateUserData(@PathVariable Long id, @RequestBody UserData userdata){
        return customerService.updateUserData(id, userdata);
    }

    @DeleteMapping("/{id}")
    public void deleteUserData(@PathVariable Long id) {
        customerService.deleteById(id);
    }

}
