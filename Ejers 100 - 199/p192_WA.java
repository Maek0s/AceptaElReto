import java.util.Scanner;

// El problema es cuando va por un sitio y ya no le sirve la otra ruta, será fixeable si se puede tirar para atras en caso de que vaya a tirar error

public class p192_WA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = -1;
        // boolean fix = false;

        while (n != 0) {
            n = s.nextInt();

            if (n == 0) { break;}
            while (n != 1) {
                if (n % 3 == 0) {
                    n = n / 3;
                } else if (n > 5) {
                    n -= 5;
                } else {
                    break;
                }
            }
            if (n == 1) {
                System.out.println("SI"); }
            else {
                System.out.println("NO");
            }
        }
        s.close();
    }
}