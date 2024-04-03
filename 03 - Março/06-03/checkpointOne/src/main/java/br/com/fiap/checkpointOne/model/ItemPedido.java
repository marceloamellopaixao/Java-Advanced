package br.com.fiap.checkpointOne.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;

@Entity
public class ItemPedido {

    @Id
    @GeneratedValue
    private Long id;

    private Integer quantidade;

    private BigDecimal valor;

    private String descricao;

}
