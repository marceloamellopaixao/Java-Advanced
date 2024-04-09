package br.com.fiap.main.controller;

import br.com.fiap.main.service.PrecoInvalidoException;
import br.com.fiap.main.service.QuantidadeInvalidaException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PedidoExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> tratamentoGeral(Exception error){
        System.out.println("Exceção do Geral: " + error.getMessage());
        return ResponseEntity.status(400).body("Você fez alguma coisa errada!");
    }

    @ExceptionHandler(QuantidadeInvalidaException.class)
    public ResponseEntity<String> tratarQuantidadeInvalida(Exception error){
        System.out.println("Exceção de tratarQuantidadeInvalida: " + error.getMessage());
        return ResponseEntity.status(400).body("Você digitou quantidade inválida!");
    }

    @ExceptionHandler(PrecoInvalidoException.class)
    public ResponseEntity<String> tratarPrecoInvalido(Exception error){
        System.out.println("Exceção de tratarPrecoInvalido: " + error.getMessage());
        return ResponseEntity.status(400).body("Você digitou preço inválido!");
    }
}
