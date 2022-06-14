public class NumerosPares {
    public static void main(String[] args){
        int x = 98;
        for (int i = 0; i < x; i++){
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
            if (i == 96){
                System.out.println(i + 2);
            }
        }
    }
}
