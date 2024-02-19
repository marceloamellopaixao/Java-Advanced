package org.example;

import javax.swing.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        GerenciadorFuncionario gerenciadorFuncionario = new GerenciadorFuncionario();
        Funcionario funcionario1 = new Funcionario(1L, "Marcelo Augusto", BigDecimal.valueOf(5000.00));
        Funcionario funcionario2 = new Funcionario(2L, "Marcelo Augusto", BigDecimal.valueOf(5000.00));

        gerenciadorFuncionario.adicionarFunc(funcionario1);
        gerenciadorFuncionario.adicionarFunc(funcionario2);

        gerenciadorFuncionario.listarFunc();
    }
}
