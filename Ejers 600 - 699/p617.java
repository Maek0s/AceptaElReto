import java.util.Scanner;

public class p617 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();

        while (c-- != 0) {
            int numletras = s.nextInt();
            s.nextLine();

            String[][] letras = new String[numletras][3];

            for (int i = 0; i < numletras; i++) {
                String entrada = s.next();
                letras[i][0] = entrada.substring(0,1);
                letras[i][1] = entrada.substring(1,2);
                letras[i][2] = entrada.substring(2,3);
            }

            for (int i = 0; i < letras.length; i++) { System.out.print(letras[i][0]); }
            for (int i = 0; i < letras.length; i++) { System.out.print(letras[i][1]); }
            for (int i = 0; i < letras.length; i++) { System.out.print(letras[i][2]); }

            System.out.println();
        }

        s.close(); // Cierre del Scanner
    }
}