
import exceptions.*;

public class Livro {

    public String titulo;
    public String autor;
    public double preco;

    public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        if (titulo.length() >= 3)
            this.titulo = titulo;
        else
            throw new LivroInvalidoException("Titulo de livro invalido");

        if (autor.contains(" ")) {
            this.autor = autor;
        } else
            throw new AutorInvalidoException("Nome de autor invalido");

        if (preco > 0) {
            this.preco = preco;
        }
        else
            throw new LivroInvalidoException("Preco de livro invalido");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}