import java.util.Scanner;

public class p694 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        s.next();
        String texto = "";
        

        while (c-- != 0) {
            texto = s.nextLine();
            String[] acronimos = texto.split(" ");
            for (int i = 0; i < acronimos.length; i++) {
                System.out.print(acronimos[i]+"-");
            }
            /*for (int i = 0; i < acronimos.length; i++) {
                System.out.print(acronimos[i].charAt(0));
            }*/
        }
        s.close();
    }
}
