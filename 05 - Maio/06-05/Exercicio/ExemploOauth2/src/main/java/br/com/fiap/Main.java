package br.com.fiap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Base64;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        String clientId = "teste@teste.com";  // substitua pelo seu client-id real
        String clientSecret = "teste";  // substitua pelo seu client-secret real
        String encodedCredentials = Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes());
        System.out.println("Basic " + encodedCredentials);
    }
}
