package br.com.fiap.exemploAula.service;

import br.com.fiap.exemploAula.model.Product;
import br.com.fiap.exemploAula.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    @Autowired
    private ProductService(ProductRepository repository){
        this.repository = repository;
    }

    // Post Mapping Request
    public Product createProduct(Product product){
        return repository.save(product);
    }

    // Get Mapping Request (ALL)
    public List<Product> findAllProduct(){
        return repository.findAll();
    }

    // Get Mapping Request (By ID)
    public Optional<Product> findProdutoById(Long id){
        return repository.findById(id);
    }

    // Delete Mapping
    public void deleteProduct(Long id){
        repository.deleteById(id);
    }
}
