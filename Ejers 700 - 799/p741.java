import java.util.*;

public class p741 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t-- != 0) {
            long n = s.nextInt();

            long result = 0;

            result = n * (3 * n + 1) / 2;

            /*
            Versión sin optimizar:

            while (x >= 2) {
                if (contador != 0) {
                    result += x / 2;
                }
                result += x;
                x -= 2;
                contador++;
            }*/
            System.out.println(result);
        }
    }
}
