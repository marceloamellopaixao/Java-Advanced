package br.com.fiap.springSecurity.repository;

import br.com.fiap.springSecurity.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
