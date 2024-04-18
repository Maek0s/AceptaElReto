import java.util.Scanner;

public class concursoD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        s.nextLine();

        while (c-- != 0) {
            int contador = 0;
            String[][] tablero = new String[3][3];

            for (int a = 0; a < 3; a++) {
                String texto = s.nextLine();
                for (int i = 0; i < 3; i++) {
                    tablero[contador][i] = Character.toString(texto.charAt(i));
                }
                contador++;
            }

            if (tablero[1][1].equalsIgnoreCase("X")) {
                System.out.println("CRUZ");
            } else if (tablero[1][1].equalsIgnoreCase("O")) {
                System.out.println("CIRCULO");
            } else {
                System.out.println("IMPOSIBLE");
            }
        }
    }
}
