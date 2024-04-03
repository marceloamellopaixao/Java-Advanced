package br.com.fiap.handons.controller;

import br.com.fiap.handons.model.Usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class HelloWorldController {
    @GetMapping("/")
    public ResponseEntity<String>helloWorld(){

        log.info("Estou passando pela página inicial!!");
        return ResponseEntity.ok("<h1>Kakashi Hatake</h1>" + "<p>Sensei do Naruto, Sasuke, Sakura e Sai (Junto ao Yamato)</p>");
    }

    @GetMapping("/um")
    public ResponseEntity<String>helloWorldUm(){

        log.info("Estou passando pela página do Naruto!!");
        return ResponseEntity.ok("<h1>Naruto Uzumaki</h1>" + "<p>O ninja mais forte da geração atual.</p>");
    }

    @GetMapping("/dois")
    public ResponseEntity<String>helloWorldDois(){

        log.info("Estou passando pela página do Sasuke!!");
        return ResponseEntity.ok("<h1>Sasuke Uchiha</h1>" + "<p>O ninja revoltado, depressivo e amigo do Naruto.</p>");
    }

    @GetMapping("/tres")
    public ResponseEntity<String>helloWorldTres(){

        log.info("Estou passando pela página da Sakura!!");
        return ResponseEntity.ok("<h1>Sakura Haruno</h1>" + "<p>A melhor ninja médica atual</p>");
    }
    @GetMapping("/quatro")
    public ResponseEntity<String>helloWorldQuatro(){

        log.info("Estou passando pela página do Sai!!");
        return ResponseEntity.ok("<h1>Sai Yamanaka</h1>" + "<p>Este ninja já foi da Anbu</p>");
    }


    @GetMapping("/user")
    public ResponseEntity<Usuario>user(){

        Usuario usuario = new Usuario("Marcelo", "marcelo@gmail.com", "564566545", "123123");

        return ResponseEntity.ok(usuario);
    }
}
