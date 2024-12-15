import java.util.*;

public class p340 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t-- != 0) {
            int resultado = 0;
            int n = s.nextInt();
            int m = s.nextInt();

            if (n == 1 && m == 1) {
                resultado = 4;
            } else {
                resultado = (n * (m + 1)) + (m * (n + 1));
            }

            System.out.println(resultado);
        }
    }
}