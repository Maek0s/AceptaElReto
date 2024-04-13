import java.util.Scanner;

public class p711_RTE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();

        while (c-- != 0) {
            int num = s.nextInt();
            int resultado = 0;

            String hola = Integer.toString(num);
            int[] numeros = new int[hola.length()];

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = Character.getNumericValue(hola.charAt(i));
            }

            for (int i = 0; i < numeros.length; i++) {
                if (i % 2 == 0) {
                    resultado += posPar((i + 1), numeros[i], numeros);
                } else {
                    resultado += posImpar(i, numeros[i], numeros);
                }
            }
            System.out.println(resultado);
        }

    }

    public static int posPar (int posicion, int numero, int[] numeros) {
        int min = 99999;

        for (int i = posicion; i < numeros.length; i++) {

            if (i == -1 || i >= numeros.length) {
                break;
            }

            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        return (numero * 3 + min);
    }

    public static int posImpar (int posicion, int numero, int[] numeros) {
        int max = 0;

        for (int i = posicion; i >= 0; i--) {

            if (i == -1 || i >= numeros.length) {
                break;
            }
            
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        return (numero * 2 + max);
    }
}
