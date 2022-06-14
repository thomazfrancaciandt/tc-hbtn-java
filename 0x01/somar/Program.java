package somar;
public class Program {
    public static void main(String[] args) {
        Numero numero = new Numero();
        System.out.printf("%d\n", Numero.somar(24, 32));
        System.out.printf("%d\n", Numero.somar(5, 0));
        System.out.printf("%d\n", Numero.somar(4, -2));

    }
}