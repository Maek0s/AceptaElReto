package Las12Uvas2024;

import java.util.Scanner;

public class ejG {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();

        while (c-- != 0) {
            int x = s.nextInt();
            int y = s.nextInt();

            int mcd = mcd(x, y);
            int mcm = (x * y) / mcd;

            System.out.println((mcm / x) + (mcm / y) - 1);
        }
    }

    public static int mcd(int x, int y) {
        int temporalY = 0;

        while (y != 0) {
            temporalY = y;
            y = x % y;
            x = temporalY;
        }

        return x;
    }
}
