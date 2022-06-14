public class Empregado {

    private final double salarioFixo;

    public Empregado(double salarioFixo) {

        this.salarioFixo = salarioFixo;
    }
    public double getSalarioFixo() {

        return salarioFixo;
    }
    public double calcularBonus(Departamento departamento) {
        if (departamento.valorAtingidoMeta())
            return this.salarioFixo * 0.1;
        else
            return 0;
    }

    public double calcularSalarioTotal(Departamento departamento){

        return salarioFixo + calcularBonus(departamento);
    }
}
