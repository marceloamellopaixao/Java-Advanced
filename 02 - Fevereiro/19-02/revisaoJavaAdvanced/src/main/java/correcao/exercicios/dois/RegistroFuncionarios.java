package correcao.exercicios.dois;

import java.util.HashSet;
import java.util.Set;

public class RegistroFuncionarios {
    private Set<Funcionario> funcionarios = new HashSet<>();

    public void adicionarFuncionario(Funcionario funcionario) throws Exception {
        if (!funcionarios.add(funcionario)) {
            throw new Exception("Funcionário já existe.");
        }
    }
    public void removerFuncionario(int id) throws Exception {
        funcionarios.removeIf(funcionario -> funcionario.id == id);
    }

    public void atualizarFuncionario(Funcionario funcionarioAtualizado) throws Exception {
        funcionarios.removeIf(funcionario -> funcionario.id == funcionarioAtualizado.id);
        funcionarios.add(funcionarioAtualizado);
    }

    public void listarFuncionarios() {
        funcionarios.forEach(funcionario -> System.out.println("ID: " + funcionario.id + ", Nome: " + funcionario.nome + ", Departamento: " + funcionario.departamento));
    }
}
