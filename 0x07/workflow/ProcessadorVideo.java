import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    private final List<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();

    public void registrarCanal(CanalNotificacao canalNotificacao) {
        this.canais.add(canalNotificacao);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : this.canais) {
            canal.notificar(new Mensagem(video.getArquivo() +
                    " - " + video.getFormatoVideo(), TipoMensagem.LOG));
        }
    }
}




