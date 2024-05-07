package br.com.fiap.profileExemploAula.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/qa/produtos")
@Profile("qa")
public class ProfileQAController {
    @Value("${env.ambiente}")
    private String ambiente;

    @GetMapping
    public ResponseEntity<String> buscarProduto(){
        return ResponseEntity.ok("Você está no ambiente: " + ambiente);
    }
}
