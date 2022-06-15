import java.util.*;

public class Blog {

    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<>();

    }

    public void adicionarPostagem(Post post){
        posts.add(post);
    }
    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet<>();
        for (Post post : posts){
            autores.add(post.getAutor());

        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> contarPosts = new TreeMap<>();
        for (Post post : posts) {
            if (contarPosts.containsKey(post.getCategoria())){
                contarPosts.put(post.getCategoria(), contarPosts.get(post.getCategoria())+1);
            }else{
                contarPosts.put(post.getCategoria(), 1);
            }
        }
        return contarPosts;
    }

}
