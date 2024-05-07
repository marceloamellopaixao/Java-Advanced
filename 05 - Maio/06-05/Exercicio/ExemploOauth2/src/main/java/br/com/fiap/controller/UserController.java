package br.com.fiap.controller;

import br.com.fiap.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(final @RequestBody UserRequestDTO rq) {
        return new ResponseEntity<>(this.service.create(rq), HttpStatus.CREATED);
    }
}