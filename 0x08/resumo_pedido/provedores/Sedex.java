package provedores;

public class Sedex implements ProvedorFrete {

    @Override
    public double calcularFrete(double peso, double valor) {
        if (peso > 1000)
            return valor*0.1;
        else
            return  valor*0.05;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
