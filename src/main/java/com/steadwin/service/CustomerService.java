package com.steadwin.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.steadwin.entity.UserData;
import com.steadwin.repository.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<UserData> getAllUsers(){
        return customerRepository.findAll();
    }

    public Optional<UserData> getUserById(Long id){
        return customerRepository.findById(id);
    }

    public UserData saveUserData(UserData userdata){
        return customerRepository.save(userdata);
    }

    public UserData updateUserData(Long id, UserData userdata){
        userdata.setId(id);
        return customerRepository.save(userdata);
    }

    public void deleteUserData(Long id){
        customerRepository.deleteById(id);
    }

    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }
    
}
