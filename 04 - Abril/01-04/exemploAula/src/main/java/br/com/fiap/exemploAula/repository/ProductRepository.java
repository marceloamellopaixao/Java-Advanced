package br.com.fiap.exemploAula.repository;

import br.com.fiap.exemploAula.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
