
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        List<Produto> listProduto = pedido.getProdutos();
        return listProduto.stream().filter(p -> p.getCategoria() == CategoriaProduto.LIVRO).collect(Collectors.toList());

    }
}