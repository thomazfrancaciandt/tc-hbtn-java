import comida.Comida;
import humor.*;

public class Personagem {
    public int pontosDeFelicidade = 0;

    public Humor obeterHumorAtual(){
        if (this.pontosDeFelicidade < -5)
            return new Irritado();
        else if (this.pontosDeFelicidade >= -5 && this.pontosDeFelicidade <= 0)
            return new Triste();
        else if (this.pontosDeFelicidade >= 1 && this.pontosDeFelicidade <= 15)
            return new Feliz();
        else
            return new MuitoFeliz();
    }

    public void comer (Comida[] comidas){
        for (Comida comida: comidas) {
            this.pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return this.pontosDeFelicidade + " - " + obeterHumorAtual().getClass().getSimpleName();
    }
}
