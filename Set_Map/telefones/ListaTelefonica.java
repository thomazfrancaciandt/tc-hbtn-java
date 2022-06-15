import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> listaTelefones;

    public ListaTelefonica() {
        this.listaTelefones = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        ArrayList<Telefone> listaContato = listaTelefones.get(nome);
        if(listaContato == null){
            listaContato = new ArrayList<Telefone>();
            listaContato.add(telefone);
            listaTelefones.put(nome, listaContato);
        }else {
            if (!listaContato.contains(telefone)){
                listaContato.add(telefone);
            }
        }
    }

    public ArrayList<Telefone> buscar(String nome){
        ArrayList<Telefone> listaContato = listaTelefones.get(nome);
        if (listaContato != null)
            return listaContato;

        return null;

    }
}

