import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> listaTelefones;

    public ListaTelefonica() {
        this.listaTelefones = new HashMap<String, HashSet<Telefone>>();
    }
    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone){
        HashSet<Telefone> listaContato = listaTelefones.get(nome);

        if(listaContato == null){
            listaContato = new HashSet<Telefone>();

        }
        if (listaContato.contains(telefone))
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");

        Iterator< HashSet<Telefone>> iteratorTelefone = listaTelefones.values().iterator();
        while (iteratorTelefone.hasNext()){
            for (Telefone telefoneIndividual : iteratorTelefone.next()){
                if (telefoneIndividual.equals(telefone)){
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }

            }
        }
        listaContato.add(telefone);
        listaTelefones.put(nome, listaContato);

        return listaContato;

    }
    public HashSet<Telefone> buscar(String nome){
        HashSet<Telefone> listaContato = listaTelefones.get(nome);
        if (listaContato != null)
            return listaContato;

        return null;

    }
}
