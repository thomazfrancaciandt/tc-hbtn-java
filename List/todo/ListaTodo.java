import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws IllegalArgumentException {
        for (Tarefa tarefaInd : tarefas) {
            if (tarefaInd.getIdentificador() == tarefa.getIdentificador())
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
        }
        this.tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {

        for (int i = 0; i < this.tarefas.size(); i++) {
            if (this.tarefas.get(i).getIdentificador() == identificador) {
                this.tarefas.get(i).setEstahFeita(true);
                return true;
            }
        }
        return false;

    }

    public boolean desfazerTarefa(int identificador) {

        for (int i = 0; i < this.tarefas.size(); i++) {
            if (this.tarefas.get(i).getIdentificador() == identificador) {
                this.tarefas.get(i).setEstahFeita(false);
                return true;
            }
        }
        return false;

    }
    public void desfazerTodas(){
        for (Tarefa tarefa : tarefas){
            tarefa.setEstahFeita(false);
        }

    }
    public void fazerTodas(){
        for (Tarefa tarefa : tarefas){
             tarefa.setEstahFeita(true);

        }

    }

    public void listarTarefas(){
        for (Tarefa tarefa : tarefas){
            if (tarefa.isEstahFeita())
                System.out.println("[X] " +  " Id: " + tarefa.getIdentificador() + " - Descricao: "
                        + tarefa.getDescricao());
            else
                System.out.println("[ ] " +  " Id: " + tarefa.getIdentificador() + " - Descricao: "
                        + tarefa.getDescricao());

        }

    }
}
