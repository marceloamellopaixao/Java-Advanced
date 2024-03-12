package br.com.fiap.controleestoque.repository;

import br.com.fiap.controleestoque.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
