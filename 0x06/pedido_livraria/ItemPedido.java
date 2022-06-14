import produtos.*;
public class ItemPedido {

    private Produto produto;
    private int quantidade;


    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
}



