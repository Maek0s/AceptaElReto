import java.util.Scanner;

public class p191 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();

        while (c-- != 0) {
            int resultado = 0;
            int contador = s.nextInt();
            int litros = s.nextInt();
            resultado += litros;
            int diferencia = s.nextInt();

            for (int i = 1; i < contador; i++) {
                litros -= diferencia;
                resultado = resultado + litros;
            }
            System.out.println(resultado);
        }
    }
}