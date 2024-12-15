import java.util.Scanner;

/*
 * Ejercicio 744 - Felicidades en el grupo
 * Autor: @Maek0s
 * Enlace: https://aceptaelreto.com/problem/statement.php?id=744
 */

public class p744 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long n = 0;

        while (s.hasNextLong()) {
            n = s.nextLong();

            long entrada = -1;
            long mensaje = 0;
            long first = 0;
            long contador = 0;

            while (entrada != 0) {
                entrada = s.nextLong();

                if (contador == 0) first = entrada;

                contador++;

                if (entrada == 0) { break; }

                if (entrada > n) {
                    mensaje++;
                    n *= 2;
                    while (n < entrada) {
                        n *= 2;
                    }
                }
            }

            if (first == 0) { System.out.println(mensaje);; }
            else if (mensaje <= 0) { System.out.println(1); }
            else { System.out.println(mensaje); }
        }
    }
}
