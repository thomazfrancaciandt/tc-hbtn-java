import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> list, int valor){
        return list.indexOf(valor);

    }
    public static void adicionarNumero(List<Integer> list, int valor) throws Exception {
        if(buscarPosicaoNumero(list, valor) == -1)
            list.add(valor);
        else throw new Exception("Numero jah contido na lista");
    }

    public static void removerNumero(List<Integer> list, int valor) throws Exception {
        if(buscarPosicaoNumero(list, valor) != -1)
            list.remove(buscarPosicaoNumero(list, valor));
        else throw new Exception("Numero nao encontrado na lista");
    }

    public static void substituirNumero(List<Integer> list, int numeroSubstituir, int numeroSubstituto){
        if (buscarPosicaoNumero(list, numeroSubstituir) != -1)
            list.set(buscarPosicaoNumero(list, numeroSubstituir),numeroSubstituto);
        else list.add(numeroSubstituto);

    }
}
