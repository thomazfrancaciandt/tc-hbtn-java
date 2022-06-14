import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica{
    private int quantidadeTransacoes;
    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor + 0.1);
    }
    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor - 0.10);
    }
}
