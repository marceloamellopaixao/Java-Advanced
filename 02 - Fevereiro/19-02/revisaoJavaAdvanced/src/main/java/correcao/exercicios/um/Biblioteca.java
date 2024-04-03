package correcao.exercicios.um;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {

    private Map<String, Livro> livros = new HashMap<>();
    private List<Livro> listaDeLivros = new ArrayList<>();

    public void adicionarLivro(Livro livro) throws Exception {
        if (livros.containsKey(livro.isbn)) {
            throw new Exception("Livro com ISBN já existe.");
        }
        livros.put(livro.isbn, livro);
    }
    public void removerLivro(String isbn) throws Exception {
        if (!livros.containsKey(isbn)) {
            throw new Exception("Livro não encontrado.");
        }
        livros.remove(isbn);
    }

    public Livro buscarLivro(String isbn) throws Exception {
        if (!livros.containsKey(isbn)) {
            throw new Exception("Livro não encontrado.");
        }
        return livros.get(isbn);
    }

    public void listarLivros() {
        livros.values().forEach(livro ->
                System.out.println("ISBN: " + livro.isbn + ", Título: "
                        + livro.titulo + ", Categoria: "
                        + livro.categoria));
    }
}
