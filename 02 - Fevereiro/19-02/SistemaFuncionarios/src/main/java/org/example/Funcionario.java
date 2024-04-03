package org.example;

import java.math.BigDecimal;
import java.util.Objects;

public class Funcionario {
    private Long id;
    private String nome;
    private BigDecimal salario;

    public Funcionario(Long id, String nome, BigDecimal salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;

        if (salario == null){
            System.out.print("Ocorreu um Erro!! Valor do salário está vazio.");
        }
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';


    }
}
