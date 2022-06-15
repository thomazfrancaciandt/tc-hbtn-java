import java.util.Objects;

public class Telefone {
    private String codigoArea;
    private String numero;
    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }
    @Override
    public String toString(){
        return "(" + codigoArea + ") " + numero;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return this.getCodigoArea() != null &&
                this.getNumero() != null &&
                this.getCodigoArea().equals(telefone.getCodigoArea()) &&
                this.getNumero().equals(telefone.getNumero());
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.codigoArea);
        hash = 31 * hash + Objects.hashCode(this.numero);
        return hash;
    }
}