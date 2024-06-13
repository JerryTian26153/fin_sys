package com.finject.homework.controller;

import com.finject.homework.entity.*;
import com.finject.homework.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @SuppressWarnings("deprecation")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/v1/Users", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Users> getAll() {
        return usersRepository.findAll();
    }
}