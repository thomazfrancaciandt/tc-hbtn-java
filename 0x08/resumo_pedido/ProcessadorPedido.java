import provedores.Frete;
import provedores.ProvedorFrete;

public class ProcessadorPedido {
    public ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }
    public void processar(Pedido pedido){
        pedido.setFrete(new Frete(provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal()),provedorFrete.obterTipoProvedorFrete()));
    }
}

