public class Tarefa {
    String descricao;
    boolean estahFeita = false;
    int identificador;

    public Tarefa(String descricao, int identificador) {
        modificarDescricao(descricao);
        this.identificador = identificador;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }
    public void concluirTarefa(){
        this.estahFeita = true;
    }
    public void desfazerTarefa(){
        this.estahFeita = false;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void modificarDescricao(String descricao) throws IllegalArgumentException{
        if (descricao.equals(null) || descricao.equals(""))
            throw new IllegalArgumentException("Descricao de tarefa invalida");

        this.descricao = descricao;

    }
}
