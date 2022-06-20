import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.err;

public class SerializarEstudantes<Estudante>{
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        FileOutputStream fileOutPut;
        ObjectOutputStream objectOutPut;
        try {
            fileOutPut = new FileOutputStream(this.nomeArquivo);
            objectOutPut = new ObjectOutputStream(fileOutPut);
            objectOutPut.writeObject(estudantes);

        } catch (Exception e) {
            err.println("Nao foi possivel serializar");
        }
    }
    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {
        List<Estudante> student = null;
        try (FileInputStream inputFile = new FileInputStream(this.nomeArquivo)) {
            ObjectInputStream outputFile = new ObjectInputStream(inputFile);
            student = (List<Estudante>) outputFile.readObject();

        } catch (Exception e) {
            System.out.println("Nao foi possivel desserializar");
        }
        return student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SerializarEstudantes)) return false;
        if (!super.equals(o)) return false;

        SerializarEstudantes is = (SerializarEstudantes) o;

        return nomeArquivo.equals(is.nomeArquivo);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + nomeArquivo.hashCode();
        return result;
    }
}