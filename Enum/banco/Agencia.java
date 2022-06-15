import java.util.ArrayList;

public class Agencia {

    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public String buscarCliente (String nomeCliente){
        for (int listaCliente = 0; listaCliente < this.clientes.size(); listaCliente++){
            if(clientes.get(listaCliente).getNome().equals(nomeCliente)){
                return String.valueOf(listaCliente);
            }
        }
        return null;
    }

    public boolean novoCliente(String nomeCliente, double transacao){
        if (buscarCliente(nomeCliente) != null)
            return false;

        this.clientes.add(new Cliente(nomeCliente, transacao));

        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double transacao){

        if(buscarCliente(nomeCliente) == null)
            return false;

        int cliente = Integer.parseInt(buscarCliente(nomeCliente));

        clientes.get(cliente).adicionarTransacao(transacao);
        return true;
    }

}