package com.springframework.enrollement.Service;

import com.springframework.enrollement.Entity.User;
import com.springframework.enrollement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnrollementService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getall(){

       return userRepository.findAll();

    }

    public Optional<User> getbyID(long id){

        return userRepository.findById(id);

    }
}
