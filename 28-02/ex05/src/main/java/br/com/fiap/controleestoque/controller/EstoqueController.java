package br.com.fiap.controleestoque.controller;

import br.com.fiap.controleestoque.model.Estoque;
import br.com.fiap.controleestoque.service.EstoqueService;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueService service;

    @PostMapping
    public ResponseEntity<Estoque> criarItem(@RequestBody Estoque estoque){
        Estoque estoqueSalvo = service.salvarEstoque(estoque);
        return ResponseEntity.ok(estoqueSalvo);
    }

    @GetMapping
    public ResponseEntity<Page<Estoque>> listarTodosProdutosComPaginacao(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "10") int size){
        Page<Estoque> estoquePaginada = service.buscaPaginada(page, size);
        return ResponseEntity.ok(estoquePaginada);
    }

    @PutMapping
    @PatchMapping
    public ResponseEntity<Estoque> atualizarEstoque(@RequestBody Estoque estoque){
        return service.atualizarEstoque(estoque);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEstoque(@PathVariable Long id){
        service.deletarEstoque(id);
        return ResponseEntity.ok().build();
    }
}
