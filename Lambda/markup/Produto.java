import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco;
    private double percentualMarkup = 0.1;


    Consumer<Double> atualizarMarkup = preco -> percentualMarkup = (preco/100);
    Supplier<Double> precoComMarkup = () -> preco * (1 + percentualMarkup);

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }




}
