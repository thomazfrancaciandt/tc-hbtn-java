import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Pedido {
    ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie (PedidoCookie pedidoCookie){
        cookies.add(pedidoCookie);
    }
    public int obterTotalCaixas (){
        int total = 0;
        for (PedidoCookie pedidoCookie : this.cookies) {
            total+= pedidoCookie.getQuantidadeCaixas();

        }
        return total;
    }

    public int removerSabor(String sabor){
        int total = 0;
        Iterator<PedidoCookie> pedidoCookieIterator = this.cookies.iterator();
        while (pedidoCookieIterator.hasNext()){
            PedidoCookie pedidoCookie = pedidoCookieIterator.next();
            if(pedidoCookie.getSabor().equals(sabor)){
                total += pedidoCookie.getQuantidadeCaixas();
                pedidoCookieIterator.remove();
            }
        }
        return total;
        }
}

