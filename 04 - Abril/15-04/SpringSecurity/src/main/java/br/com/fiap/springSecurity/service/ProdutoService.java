package br.com.fiap.springSecurity.service;

import br.com.fiap.springSecurity.model.Produto;
import br.com.fiap.springSecurity.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public Produto criarProduto(Produto produto){
        return repository.save(produto);
    }

    public List<Produto> buscarTodosProdutos(){
        return repository.findAll();
    }
}
