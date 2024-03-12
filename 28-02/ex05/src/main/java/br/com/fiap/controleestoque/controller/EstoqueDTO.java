package br.com.fiap.controleestoque.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class EstoqueDTO {
    @NotBlank
    private String nomeProduto;

    @NotBlank
    @Positive
    private int quantidade;

    @NotBlank
    private String localizacaoArmazem;
}
