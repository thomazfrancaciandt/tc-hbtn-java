import java.util.Locale;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String palavras){

        TreeMap<String, Integer> map = new TreeMap<>();

        palavras = palavras.replace("?", "");
        palavras = palavras.replace("!", "");
        palavras = palavras.replace(".", "");

        String[] item = palavras.split(" ");

        int contator = 0;
        for (int i = 0; i < item.length; i++){
            for (int j = 0; j < item.length; j++){
                if (item[i].equalsIgnoreCase(item[j])){
                    contator++;
                }
            }
            map.put(item[i].toLowerCase(), contator);
            contator = 0;
        }
        return map;
    }

}
