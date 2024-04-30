package com.example.demo.controller;

import org.springframework.http.ResponseEntity;

public class Controller {
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Ok endpoint acessado");
    }
}
