import java.util.ArrayList;
import java.util.List;

public class Biblioteca <T extends Midia > {

    private List<T> midias = new ArrayList<>();

    public void adicionarMidia(T t){
        this.midias.add(t);
    }

    public List<T> obterListaMidias(){
        return midias;
    }

}
