import java.util.Scanner;

// AC: https://aceptaelreto.com/problem/submission.php?id=838450

public class p158 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        int muros = 0;

        while (c-- != 0) {
            int altura = 0;
            int actual = 0;
    
            int arriba = 0; int abajo = 0;

            muros = s.nextInt();
            altura = s.nextInt();
            actual = altura;
            for (int i = 0; i < muros - 1; i++) {
                altura = s.nextInt();
                if (actual < altura) {
                    arriba++;
                } else if (actual > altura) {
                    abajo++;
                }
                actual = altura;
            }
            System.out.println(arriba + " " + abajo);
        }
        s.close();
    }
}