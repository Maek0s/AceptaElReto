import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Problema 100: Kaprekar
 * Autor: @Maek0s
 * Enlace: https://aceptaelreto.com/problem/statement.php?id=100
 */

public class p100 {

    // Constante que representa el número Kaprekar
    private static final String KRAPEKAR = "6174";
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        s.nextLine();

        while (t-- != 0) {
            String n = s.nextLine();
            int veces = 0;
            int mayor; int menor;

            // Si el número es un repdigit, no se puede hacer nada
            if (!isRepdigit(n)) {
                while (veces < 8) {
                    if (isKaprekar(n)) { break; }

                    if (veces == 8) {
                        break;
                    }

                    n = formatear(n);
                    mayor = Integer.parseInt(mayor(n));
                    menor = Integer.parseInt(menor(n));
                    n = Integer.toString(mayor - menor);

                    // Pruebas: System.out.println(mayor + " - " + menor + " = " + n);

                    veces++;
                }
            } else {
                veces = 8;
            }

            System.out.println(veces);
        }
    }

    // Formatea el número para que tenga 4 dígitos
    public static String formatear(String n) {
        while (n.length() != 4) {
            if (n.length() != 4) {
                n = "0" + n;
            }
        }

        return n;
    }

    // Devuelve el número mayor
    public static String mayor(String n) {
        String numero = "";

        ArrayList <Integer> nums = new ArrayList<>();

        for (int i = 0; i < n.length(); i++) {
            nums.add(Character.getNumericValue(n.charAt(i)));
        }

        Collections.sort(nums);

        for (int i = nums.size() - 1; i >= 0; i--) {
            numero += nums.get(i);
        }

        return numero;
    }

    // Devuelve el número menor
    public static String menor(String n) {
        String numero = "";

        ArrayList <Integer> nums = new ArrayList<>();

        for (int i = 0; i < n.length(); i++) {
            nums.add(Character.getNumericValue(n.charAt(i)));
        }

        Collections.sort(nums);

        for (int i = 0; i < nums.size(); i++) {
            numero += nums.get(i);
        }

        return numero;
    }

    // Comprueba si el número es Kaprekar
    public static boolean isKaprekar(String n) {
        if (n.equalsIgnoreCase(KRAPEKAR)) {
            return true;
        } else {
            return false;
        }
    }

    // Comprueba si el número es un repdigit
    public static boolean isRepdigit(String n) {
        int contador = 0;

        for (int i = 0; i < n.length() - 1; i++) {
            if (n.charAt(i) == n.charAt(i + 1)) {
                contador++;
            } else {
                return false;
            }
        }

        // Si el contador es 3, significa que todos los dígitos son iguales
        if (contador == 3) {
            return true;
        } else {
            return false;
        }
    }
}
