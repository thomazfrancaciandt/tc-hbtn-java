public class PersonagemGame {
    public int saudeAtual;
    public String nome;
    private String status;
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
        this.nome = nome;
    }
    public String getStatus() {
        return status;
    }
}