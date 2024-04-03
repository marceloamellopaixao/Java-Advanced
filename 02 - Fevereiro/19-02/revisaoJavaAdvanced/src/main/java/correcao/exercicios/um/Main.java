package correcao.exercicios.um;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        try {
            biblioteca.adicionarLivro(new Livro("1234", "Java Fundamentals", Categoria.EDUCATIVO));
            biblioteca.adicionarLivro(new Livro("5678", "The Great Gatsby", Categoria.FICCAO));
            System.out.println("Lista de Livros Após Adições:");
            biblioteca.listarLivros();
            biblioteca.adicionarLivro(new Livro("1234", "Java Fundamentals", Categoria.EDUCATIVO));

            System.out.println("\nBuscando Livro com ISBN 1234:");
            System.out.println(biblioteca.buscarLivro("1234"));

            biblioteca.removerLivro("1234");
            System.out.println("\nLista de Livros Após Remoção:");
            biblioteca.listarLivros();
        } catch (Exception e) {
            System.out.prinRH>tln(e.getMessage());
        }
    }
}
