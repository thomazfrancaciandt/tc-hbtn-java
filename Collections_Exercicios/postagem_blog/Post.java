import java.util.Objects;

public class Post implements Comparable<Post>{

    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    @Override
    public int compareTo(Post o) {
        return this.toString().compareTo(o.toString());
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, categoria, corpo, titulo);
    }


    @Override
    public boolean equals(Object o) {
        Post post = (Post) o;
        return this.getTitulo().equals(post.titulo) && this.getAutor().equals(post.autor);
    }


}