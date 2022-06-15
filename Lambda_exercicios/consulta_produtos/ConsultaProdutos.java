import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterio){
        List<Produto> filtrarProdutos = new ArrayList<>();
        produtos.forEach(teste -> {if(criterio.testar(teste)) {
            filtrarProdutos.add(teste);
        }
        });
        return filtrarProdutos;
    }
}
