import java.util.Scanner;

public class p416 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = -1;
        int contador = 0;
        String n = "";
        String dia = "";
        String mes = "";

        while (c != 0) {
            c = s.nextInt();
            s.nextLine();

            if (c == 0) { break; }

            for (int i = 0; i < c; i++) {
                n = s.nextLine();
                
                /*System.out.println(n.indexOf("/"));
                if (n.indexOf("/") == 1) {
                    dia = String.valueOf(n.charAt(0));
                }*/

                String[][] fecha = new String[c][2];
                String[] dias = n.split("/");

                for (int j = 0; j < dias.length; j++) {
                    System.out.println(dias[i]);
                }
            }
            contador++;
        }
    }
}
