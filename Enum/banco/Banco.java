import java.util.ArrayList;

public class Banco {

    private String nome;
    ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public String buscarAgencia(String nomeAgencia) {
        for (int pegarAgencia = 0; pegarAgencia < this.agencias.size(); pegarAgencia++) {
            if (agencias.get(pegarAgencia).getNome().equals(nomeAgencia)) {
                return String.valueOf(pegarAgencia);
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        if (buscarAgencia(nomeAgencia) != null)
            return false;

        this.agencias.add(new Agencia(nomeAgencia));
        return true;
    }
    //verificar se der erro
    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double transacao) {

        if (buscarAgencia(nomeAgencia) == null)
            return false;

        int agencia = Integer.parseInt(buscarAgencia(nomeAgencia));

        if (agencias.get(agencia).getNome().equals(nomeAgencia)) {
            if (agencias.get(agencia).buscarCliente(nomeCliente) == null) {
                agencias.get(agencia).novoCliente(nomeCliente, transacao);
                return true;
            } else
                return false;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double transacao){

        if (buscarAgencia(nomeAgencia) == null)
            return false;

        int agencia = Integer.parseInt(buscarAgencia(nomeAgencia));

        if (agencias.get(agencia).getNome().equals(nomeAgencia)){
            agencias.get(agencia).adicionarTransacaoCliente(nomeCliente, transacao);
            return true;

        }
        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean printTransacoes){

        if (buscarAgencia(nomeAgencia) != null) {

            int agencia = Integer.parseInt(buscarAgencia(nomeAgencia));
            if (printTransacoes == true){
                for(int i = 0; i < agencias.get(agencia).getClientes().size(); i++){
                    System.out.println("Cliente: " + agencias.get(agencia).getClientes().get(i).getNome()
                            + " [" + (i+1) + "]");

                    for(int j = 0; j < agencias.get(agencia).getClientes().get(i).getTransacoes().size(); j++ ){
                        System.out.println("  [" + (j+1) + "]" + " valor "
                                + agencias.get(agencia).getClientes().get(i).getTransacoes().get(j));
                    }
                }
            }else
                System.out.println("Cliente: " + agencias.get(agencia).getClientes() + " [" + agencia + "]");
            return true;
        }
        return false;
    }
}

