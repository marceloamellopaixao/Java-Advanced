package br.com.fiap.CatalogoProduto.controller.dto;

import lombok.Data;

@Data
public class CatalogoProdutoUpdateDTO {
    private String nome;
    private String descricao;
    private Double preco;
}
