import java.util.Scanner;

public class p196 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[][] sudoku = new String[9][9];

        int c = s.nextInt();
        //s.nextLine();

        while (c-- != 0) {
            for (int i = 0; i < sudoku.length; i++) {
                for (int j = 0; j < sudoku.length; j++) {
                    sudoku[i][j] = s.next();
                    System.out.println(i + " "+ j+": " + sudoku[i][j]);
                }
            }
        }
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j]);
            }
            System.out.println();
        }
        s.close();
    }
}
