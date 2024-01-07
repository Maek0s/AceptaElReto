import java.util.Scanner;

/*
 * 7
 * 22 47 16 41 10 35 4 5 23 48 17 42 11 29 30 6 24 49 18 36 12 13 31 7 25 43 19 37 38 14 32 1 26 44 20 21 39 8 33 2 27 45 46 15 40 9 34 3 28
 * 8
 * 1 63 62 4 5 59 58 8 56 10 11 53 52 14 15 49 48 18 19 45 44 22 23 41 25 39 38 28 29 35 34 32 33 31 30 36 37 27 26 40 24 42 43 21 20 46 47 17 16 50 51 13 12 54 55 9 57 7 6 60 61 3 2 64
 */

public class p101 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = -1;
        int suma = 0;
        int sumaextra = 0;
        String resultado = "NO";

        while (c != 0) {
            resultado = "NO";
            suma = 0;
            sumaextra = 0;
            c = s.nextInt();

            if (c == 0) { break; }

            int[][] matriz = new int[c][c];

            for (int i = 0; i < c; i++) {
                for (int j = 0; j < c; j++) {
                    matriz[i][j] = s.nextInt();
                    if (j == 0) {
                        suma += matriz[0][i]; // Parte superior
                        sumaextra += matriz[i][0]; // Lateral izquierdo
                    }
                }
            }

            // System.out.println(suma);
            // System.out.println(sumaextra);

            if (sumaextra == suma) {
                sumaextra = 0;
                for (int i = 0; i < c; i++) {
                    sumaextra += matriz[i][c - 1]; // Lateral derecho
                }
                if (sumaextra == suma) {
                    sumaextra = 0;
                    for (int i = 0; i < c; i++) {
                        sumaextra += matriz[c - 1][i]; // Parte inferior
                    }
                    if (sumaextra == suma) {
                        resultado = "DIABOLICO";
                    }
                }
            }

            if (resultado.equalsIgnoreCase("DIABOLICO")) {
                if (c % 2 == 0) {
                    sumaextra = matriz[0][0] + matriz[c - 1][0] + matriz[0][c - 1] + matriz[c - 1][c - 1]; // Esquinas
                    if (suma == sumaextra) {
                        // System.out.println("Esquinas pasadas");
                        sumaextra = matriz[(c - 1) / 2][(c - 1) / 2] + matriz[(c - 1) / 2 + 1][(c - 1) / 2] + matriz[(c - 1) / 2][(c - 1) / 2 + 1] + matriz[(c - 1) / 2 + 1][(c - 1) / 2 + 1]; // Centro
                        if (suma == sumaextra) {
                            // System.out.println("Centro pasado");
                            sumaextra = (matriz[0][(c - 1) / 2] + matriz[0][(c - 1) / 2 + 1] + matriz[(c - 1) / 2][0] + matriz[(c - 1) / 2 + 1][0] + matriz[(c - 1)][(c - 1) / 2] + matriz[(c - 1)][(c - 1) / 2 + 1] + matriz[(c - 1) / 2][c - 1] + matriz[(c - 1) / 2 + 1][c - 1]) / 2; // Centro lados
                            if (suma == sumaextra) {
                                // System.out.println("Centro lados pasado");
                                resultado = "ESOTERICO";
                            }
                        }
                    }
                } else if (c % 2 == 1) {
                    suma = (4 * suma) / c;
                    sumaextra = matriz[0][0] + matriz[0][c - 1] + matriz[c - 1][0] + matriz[c - 1][c - 1]; // Esquinas
                    // System.out.println(matriz[0][0] +" "+ matriz[0][c - 1] +" "+ matriz[c - 1][0] +" "+ matriz[c - 1][c - 1]);
                    if (suma == sumaextra) {
                        // System.out.println("Esquinas pasadas");
                        if (suma == (matriz[(c - 1) / 2][(c - 1) / 2]) * 4) {
                            // System.out.println("Centro pasado");
                            sumaextra = matriz[0][(c - 1) / 2] + matriz[(c - 1) / 2][0] + matriz[(c - 1) / 2][c - 1] + matriz[c - 1][(c - 1) / 2]; // Centro lados
                            if (suma == sumaextra) {
                                // System.out.println("Centro lados pasado");
                                resultado = "ESOTERICO";
                            }
                        }
                    }
                }
            }

            // System.out.println();
            // for (int i = 0; i < c; i++) {
            //     for (int j = 0; j < c; j++) {
            //        System.out.print(matriz[i][j]+" ");
            //     }
            //     System.out.println();
            // }
        
            System.out.println(resultado);
        }
        s.close();
    }
}
