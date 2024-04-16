package br.com.fiap.springSecurity.controller;

import br.com.fiap.springSecurity.model.Produto;
import br.com.fiap.springSecurity.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    public ProdutoController(ProdutoService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Produto> criarProduto(Produto produto){
        return ResponseEntity.ok(service.criarProduto(produto));
    }

    @GetMapping
    public ResponseEntity<List<Produto>> buscarProdutos(){
        return ResponseEntity.ok(service.buscarTodosProdutos());
    }
}
