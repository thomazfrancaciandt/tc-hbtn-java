public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }
    public double calcularTotal() {
        double total = 0;
        for (ItemPedido x : itens) {
            total = total + x.getQuantidade() * x.getProduto().obterPrecoLiquido();
        }
        return total = total - total * this.percentualDesconto / 100;
        }
        public void apresentarResumoPedido () {
            System.out.println("------- RESUMO PEDIDO -------");
            double total = 0;
            for (ItemPedido x : itens) {
                total += x.getProduto().obterPrecoLiquido() * x.getQuantidade();
                System.out.println("Tipo: " + x.getProduto().getClass().getSimpleName() +
                        "  Titulo: " + x.getProduto().getTitulo() +
                        "  Preco: " + String.format("%.2f", x.getProduto().obterPrecoLiquido()) +
                        "  Quant: " + x.getQuantidade() +
                        "  Total: " + String.format("%.2f", x.getQuantidade() * x.getProduto().obterPrecoLiquido()));
            }
            double desconto = total * percentualDesconto / 100;
            System.out.println("----------------------------");
            System.out.format("DESCONTO: %.2f\n", desconto);
            System.out.format("TOTAL PRODUTOS: %.2f\n", total);
            System.out.println("----------------------------");
            System.out.format("TOTAL PEDIDO: %.2f\n", total - desconto);
            System.out.println("----------------------------");
        }
    }
