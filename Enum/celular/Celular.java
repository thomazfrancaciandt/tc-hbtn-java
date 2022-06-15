import java.util.ArrayList;
public class Celular {
    ArrayList <Contato> contatos;

    public Celular(){
        this.contatos = new ArrayList<Contato>();
    }
    public int obterPosicaoContato(String nome) {
        for (int posicaoContato = 0; posicaoContato < this.contatos.size(); posicaoContato++) {
            if (contatos.get(posicaoContato).getNome().equals(nome)) {
                return posicaoContato;
            }
        }
        return -1;
    }
    public void adicionarContato(Contato contato){
        if(obterPosicaoContato(contato.getNome()) != -1)
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        this.contatos.add(contato);
    }
    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        int posicaoAntigo = obterPosicaoContato(contatoAntigo.getNome());

        if (posicaoAntigo != -1){
            if (! contatoAntigo.getNome().equals(novoContato.getNome()))
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            this.contatos.set(posicaoAntigo, novoContato);
        }else
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");

    }

    public void removerContato(Contato contato){
        int posicaoContato = obterPosicaoContato(contato.getNome());

        if (posicaoContato == -1)
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        this.contatos.remove(posicaoContato);
    }
    public void listarContatos(){
        for (Contato contato : contatos){
            System.out.println(contato.getNome() + " -> " + contato.getNumero() + " (" + contato.getTipo() + ")");

        }
    }
}


