public class Departamento {
    private final double valorMeta;
    private final double valorAtingidoMeta;
    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }
    public boolean alcancouMeta() {

        return this.valorAtingidoMeta >= valorMeta;
    }
    public boolean valorAtingidoMeta() {

        return this.valorAtingidoMeta >= valorMeta;
    }
    public double getValorMeta() {
        return valorMeta;
    }
    public double getValorAtingidoMeta() {

        return valorAtingidoMeta;
    }
}

