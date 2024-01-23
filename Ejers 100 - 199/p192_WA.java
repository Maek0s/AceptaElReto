import java.util.Scanner;

public class p192_WA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = -1;

        while (n != 0) {
            n = s.nextInt();

            if (n == 0) { break;}
            while (n != 1) {
                if (n % 3 == 0) {
                    n = n / 3;
                    if (n > 5) {
                        n -= 5;
                    }
                } else if (n > 5) {
                    n -= 5;
                } else {
                    System.out.println("NO");
                    break;
                }
            }
            if (n == 1) { System.out.println("SI"); }

            s.close();
        }
    }
}