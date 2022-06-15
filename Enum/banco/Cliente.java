import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes = new ArrayList<Double>();

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public Cliente(String nome, double transacao) {
        this.nome = nome;
        this.transacoes.add(transacao);
    }

    public void adicionarTransacao(double transacao){
        this.transacoes.add(transacao);
    }
}


