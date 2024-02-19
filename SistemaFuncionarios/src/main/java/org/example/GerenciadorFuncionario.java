package org.example;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorFuncionario {

    private Set<Funcionario> funcionarios = new HashSet<>();

    public String adicionarFunc(Funcionario funcionario){
        funcionarios.add(funcionario);
        return "Funcionário Adicionado com Sucesso!!";
    }

    public String removerFunc(Funcionario funcionario){
        funcionarios.remove(funcionario);
        return "Funcionário Removido com Sucesso!!";
    }

    public void listarFunc(){
        funcionarios.forEach(funcionario -> {
            System.out.print(funcionario.toString() + "\n");
        });
    }
}
