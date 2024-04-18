import java.util.Scanner;

public class pH {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int islaX = s.nextInt();
        int islaY = s.nextInt();

        String[][] isla = new String[islaY][islaX];

        int robotX = s.nextInt();
        int robotY = s.nextInt();

        isla[robotY][robotX] = "O";

        int tesoroX = s.nextInt();
        int tesoroY = s.nextInt();

        isla[tesoroY][tesoroX] = "X";

        int numceldas = s.nextInt();

        for (int i = 0; i < numceldas; i++) {
            int celdaX = s.nextInt();
            int celdaY = s.nextInt();

            isla[celdaY][celdaX] = "-";
        }

        for (int i = 0; i < islaY; i++) {
            for (int j = 0; j < islaX; j++) {
                if (isla[i][j] != "") {
                    isla[i][j] = " ";
                }
            }
        }
        for (int i = 0; i < islaY; i++) {
            for (int j = 0; j < islaX; j++) {
                System.out.print(isla[i][j]);
            }
            System.out.println();
        }
    }
}
