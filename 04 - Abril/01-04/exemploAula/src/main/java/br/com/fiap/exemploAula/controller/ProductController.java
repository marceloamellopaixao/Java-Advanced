package br.com.fiap.exemploAula.controller;

import br.com.fiap.exemploAula.model.Product;
import br.com.fiap.exemploAula.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service){
        this.service = service;
    }

    // Get Mapping Request (FindAll)
    @GetMapping
    public ResponseEntity<List<Product>> findAllProduct(){
        return ResponseEntity.ok(service.findAllProduct());
    }

    // Get Mapping Request (FindProductById)
    @GetMapping("/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable Long id){
        return ResponseEntity.ok(service.findProdutoById(id).orElseThrow());
    }

    // Post Mapping Request (createProduct)
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.ok(service.createProduct(product));
    }

    // Delete Mapping Request (DeleteProduct)
    @DeleteMapping
    public ResponseEntity<Void> deleteProduct(@RequestParam Long id){
        service.deleteProduct(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
