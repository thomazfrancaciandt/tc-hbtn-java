public class ContaBancariaControlada extends ContaBancariaBasica{
    private double saldoMinimo;
    private double valorPenalidade;
    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }
    @Override
    void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();
        double saldo = this.getSaldo();
        if (saldo < this.saldoMinimo || saldo == 0)
            this.setSaldo(saldo-valorPenalidade);
    }
}
