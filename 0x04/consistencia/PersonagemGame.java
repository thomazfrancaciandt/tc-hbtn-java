public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        this.saudeAtual = saudeAtual;
        this.nome = nome;
        setNome(nome);
        setSaudeAtual(saudeAtual);
    }

    public void tomarDano (int quantidadeDeDano) {
        setSaudeAtual(this.saudeAtual - quantidadeDeDano);
        if (this.saudeAtual < 0){
            setSaudeAtual(0);
        }
    }
    public void receberCura (int quantidadeDeCura) {
        setSaudeAtual(this.saudeAtual + quantidadeDeCura);
        if (this.saudeAtual > 100) {
            setSaudeAtual(100);
        }
    }
    public int getSaudeAtual() {
        return saudeAtual;
    }
    public void setSaudeAtual(int saudeAtual) {
        if (saudeAtual <= 0) {
            this.saudeAtual = 0;
            this.status = "morto";
        } else if (saudeAtual >= 100) {
            this.saudeAtual = 100;
            this.status = "vivo";
        }else{
            this.saudeAtual = saudeAtual;
            this.status = "vivo";
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome == null || nome.equals("")){
            return;
        }
        this.nome = nome;
    }
    public String getStatus() {
        return status;
    }
}