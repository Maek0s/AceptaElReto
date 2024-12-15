import java.util.Scanner;

/*
 * Ejercicio 165 - Número hyperpar
 * @Maek0s
 * https://aceptaelreto.com/problem/statement.php?id=165
 */

public class p165 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = 0;

        while (n >= 0) {
            n = s.nextInt();

            if (n < 0) {
                break;
            }

            String nstring = Integer.toString(n);

            int contador = 0;
            for (int i = 0; i < nstring.length(); i++) {
                if (Character.getNumericValue(nstring.charAt(i)) % 2 == 0) {
                    contador++;
                }
            }
            if (contador == nstring.length()) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        s.close();
    }
}
