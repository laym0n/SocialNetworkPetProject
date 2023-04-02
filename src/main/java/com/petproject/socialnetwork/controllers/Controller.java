package com.petproject.socialnetwork.controllers;


import com.example.dal.AuthorityRepository;
import com.example.dal.entiies.AuthorityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    AuthorityRepository authorityRepository;

//    @Autowired
//    public Controller(AuthorityRepository authorityRepository) {
//        this.authorityRepository = authorityRepository;
//    }
//
    @GetMapping("/")
    public AuthorityEntity get(){
        return new AuthorityEntity();
    }
//
//    @PostMapping("/")
//    public void addUser(Authority authority){
//        authorityRepository.save(authority);
//    }
}
