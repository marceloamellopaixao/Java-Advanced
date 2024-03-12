package br.com.fiap.controleestoque.service;

import br.com.fiap.controleestoque.model.Estoque;
import br.com.fiap.controleestoque.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;

    // POST (CREATE)
    public Estoque salvarEstoque(Estoque estoque){
        // Regras de Negócio
        return estoqueRepository.save(estoque);
    }

    // GET (READ)
    public Page<Estoque> buscaPaginada(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size, Sort.unsorted());
        return estoqueRepository.findAll(pageRequest);
    }

    // PUT (UPDATE)
    public void atualizarEstoque(Estoque estoque) {
        Optional<Estoque> estoqueSalvo = estoqueRepository.findById(estoque.getId());
        return estoqueRepository.save(estoqueSalvo);
    }

    // DELETE http://localhost:8080/api/estoque/1
    public void deletarEstoque(Long id) {
        estoqueRepository.deleteById(id);
    }
}
