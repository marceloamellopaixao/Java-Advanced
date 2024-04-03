package br.com.fiap.CatalogoProduto.service;

import br.com.fiap.CatalogoProduto.controller.dto.CatalogoProdutoDTO;
import br.com.fiap.CatalogoProduto.controller.dto.CatalogoProdutoUpdateDTO;
import br.com.fiap.CatalogoProduto.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class CatalogoProdutoService {

    private final Map<Long, Produto> mapProdutos = new HashMap<>();

    private final AtomicLong counter = new AtomicLong();


    // Metodo para Criar o Produto
    public Produto createProduto(CatalogoProdutoDTO catalogoProdutoDTO){
        Produto produto = new Produto();
        produto.setId(counter.incrementAndGet());
        produto.setNome(catalogoProdutoDTO.getNome());
        produto.setDescricao(catalogoProdutoDTO.getDescricao());
        produto.setPreco(catalogoProdutoDTO.getPreco());
        mapProdutos.put(produto.getId(), produto);
        return produto;
    }

    // Metodo para Listar o Produto
    public List<Produto> listProdutos(){

        return new ArrayList<>(mapProdutos.values());
    }


    public Produto getProduto(Long id){
        return mapProdutos.get(id);
    }

    public Produto updateProduto(Long id, CatalogoProdutoUpdateDTO catalogoProdutoUpdateDTO){
        Produto produto = mapProdutos.get(id);
        if (produto != null){
            produto.setNome(catalogoProdutoUpdateDTO.getNome());
            produto.setDescricao(catalogoProdutoUpdateDTO.getDescricao());
            produto.setPreco(catalogoProdutoUpdateDTO.getPreco());
        }
        return produto;
    }

    public void deleteProduto(Long id){
        mapProdutos.remove(id);
    }

}
