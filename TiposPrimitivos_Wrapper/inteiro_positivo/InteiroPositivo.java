public class InteiroPositivo  {
    private int valor;

    public InteiroPositivo(int valor) throws IllegalArgumentException{
        if (valor < 0)
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        this.valor = valor;
    }
    public InteiroPositivo(String valor) throws IllegalArgumentException  {
        int vCovertido = Integer.parseInt(valor);
        if (vCovertido < 0)
            throw new IllegalArgumentException ("Valor nao eh um valor inteiro positivo");
        this.valor = vCovertido;
    }

    public boolean ehPrimo(){
        if (this.valor == 1)
            return false;

        for (int x = 2; x < this.valor; x++){
            if(this.valor % x == 0)
                return false;
        }
        return true;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(int valor) throws IllegalArgumentException {
        if (valor < 0)
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        this.valor = valor;
    }
}
