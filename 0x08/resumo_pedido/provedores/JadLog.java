package provedores;

public class JadLog implements ProvedorFrete{
    @Override
    public double calcularFrete(double peso, double valor) {
        if (peso > 2000)
            return valor*0.07;
        else
            return valor*0.045;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
