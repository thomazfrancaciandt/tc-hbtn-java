
public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }
    public double calcularTotal(){
        double total = 0;
        for (ItemPedido x: itens) {
            total = total + x.getQuantidade() * x.getProduto().obterPrecoLiquido();
        }
            return total = total - total * this.percentualDesconto/100;
        }

    }




