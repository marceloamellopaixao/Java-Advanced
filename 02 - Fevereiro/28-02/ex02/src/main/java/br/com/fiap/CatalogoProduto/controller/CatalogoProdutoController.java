package br.com.fiap.CatalogoProduto.controller;

import br.com.fiap.CatalogoProduto.controller.dto.CatalogoProdutoDTO;
import br.com.fiap.CatalogoProduto.controller.dto.CatalogoProdutoUpdateDTO;
import br.com.fiap.CatalogoProduto.model.Produto;
import br.com.fiap.CatalogoProduto.service.CatalogoProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class CatalogoProdutoController {
    private final CatalogoProdutoService catalogoProdutoService;

    @Autowired
    public CatalogoProdutoController(CatalogoProdutoService catalogoProdutoService) {
        this.catalogoProdutoService = catalogoProdutoService;
    }

    @PostMapping
    public ResponseEntity<Produto> createProduto(@RequestBody CatalogoProdutoDTO catalogoProdutoDTO) {
        Produto produto = catalogoProdutoService.createProduto(catalogoProdutoDTO);
        return ResponseEntity.ok(produto);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getAllTasks() {
        return ResponseEntity.ok(catalogoProdutoService.listProdutos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getProduto(@PathVariable Long id) {
        Produto produto = catalogoProdutoService.getProduto(id);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> updateProduto(@PathVariable Long id, @RequestBody CatalogoProdutoUpdateDTO catalogoProdutoUpdateDTO) {
        Produto produto = catalogoProdutoService.updateProduto(id, catalogoProdutoUpdateDTO);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduto(@PathVariable Long id) {
        catalogoProdutoService.deleteProduto(id);
        return ResponseEntity.ok().build();
    }
}
