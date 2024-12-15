import java.util.*;

public class p747 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int f = -1;
        int c = -1;

        while (f != 0 && c != 0) {
            f = s.nextInt();
            c = s.nextInt();
            s.nextLine();

            if (f == 0 && c == 0) { break; }

            String[][] mapa = new String[f][c];

            for (int i = 0; i < f; i++) {
                String linea = s.nextLine();
                for (int j = 0; j < c; j++) {
                    mapa[i][j] = String.valueOf(linea.charAt(j));
                }
            }

            int x = 0;
            int y = 0;

            String respuesta = "NO";

            boolean stacked = false;
            int contador = 0;

            while (true) {
                if (x == c - 1 && y == f - 1) {
                    respuesta = "SI";
                    break;
                }
                if (x != c - 1) {
                    if (mapa[y][x + 1].equalsIgnoreCase(".")) {
                        x += 1;
                    } else {
                        if (y != f - 1) {
                            if (mapa[y][x + 1].equalsIgnoreCase("X")) {
                                if (mapa[y + 1][x].equalsIgnoreCase(".")) {
                                    y += 1;
                                    stacked = true;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                // System.out.println((y + 1) + " " + (x + 1) + " | " + f + " " + c);
            }
            System.out.println(respuesta);
            // System.out.println();
            /*
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(mapa[i][j] +" ");
                }
                System.out.println();
            }*/
        }
    }
}
