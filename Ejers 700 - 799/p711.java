import java.util.Scanner;

public class p711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();

        while (c-- != 0) {
            long num = s.nextLong();
            long resultado = 0;

            String numstring = Long.toString(num);
            int[] numeros = new int[numstring.length()];

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = Character.getNumericValue(numstring.charAt(i));
            }

            for (int i = 0; i < numeros.length; i++) {
                if ((i + 1) % 2 == 0) {
                    resultado += posPar(i, numeros[i], numeros);
                } else {
                    resultado += posImpar(i + 1, numeros[i], numeros);
                }
            }
            System.out.println(resultado);
        }

        s.close(); // Cierre del Scanner
    }

    public static long posImpar (int posicion, int numero, int[] numeros) {
        long min = 999999999999999999L;

        for (int i = posicion; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        return (numero * 3 + min);
    }

    public static long posPar (int posicion, int numero, int[] numeros) {
        long max = 0;

        for (int i = posicion - 1; i >= 0; i--) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        return (numero * 2 + max);
    }
}
