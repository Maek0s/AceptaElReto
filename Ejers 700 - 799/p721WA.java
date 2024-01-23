import java.util.Scanner;

// Esta es una alternativa que falla.

public class p721WA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();

        for (int i = 0; i < c; i++) {
            int resul = 0;
            int n = s.nextInt();

            while (n >= 1) {
                if (n > 10) {
                    n -= 10;
                    resul++;
                } else if (n > 6) {
                    n -= 6;
                    resul++;
                } else if (n > 3) {
                    n -= 3;
                    resul++;
                } else if (n >= 1) {
                    n--;
                    resul++;
                } else {
                    break;
                }
            }
            System.out.println(resul);
        }
        s.close();
    }
}