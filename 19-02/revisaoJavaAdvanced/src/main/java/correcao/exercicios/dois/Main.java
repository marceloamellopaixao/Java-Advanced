package correcao.exercicios.dois;

public class Main {

    public static void main(String[] args) {
        RegistroFuncionarios registro = new RegistroFuncionarios();
        try {
            registro.adicionarFuncionario(new Funcionario(1, "Alice", Departamento.TI));
            registro.adicionarFuncionario(new Funcionario(2, "Bob", Departamento.RH));
            System.out.println("Funcionários após adições:");
            registro.listarFuncionarios();

            registro.removerFuncionario(1);
            System.out.println("\nFuncionários após remoção:");
            registro.listarFuncionarios();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
