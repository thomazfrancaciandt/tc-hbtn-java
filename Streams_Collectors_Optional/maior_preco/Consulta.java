import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.Comparator.comparing;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        List<Produto> listProduto = pedido.getProdutos();
        return listProduto.stream().filter(p -> p.getCategoria() == CategoriaProduto.LIVRO).collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> listaProduto) {
        Optional<Produto> result = listaProduto.stream().sorted(comparing(Produto::getPreco).reversed()).findFirst();
        return result.orElse(null);
    }

}