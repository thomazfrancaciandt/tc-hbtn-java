import java.util.*;
import java.util.stream.Collectors;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros){
        List<Integer> list = Arrays.stream(numeros).boxed().collect(Collectors.toList());

        HashSet<Integer> hashSet = new HashSet<Integer>();
        List<Integer> separarDuplicidade = list.stream().filter(i -> !hashSet.add(i)).collect(Collectors.toList());

        return new TreeSet<>(separarDuplicidade);

    }


}
