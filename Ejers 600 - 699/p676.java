import java.util.Scanner;

public class p676 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();

        while (c-- != 0) {
            int contnum1 = 0;
            int contnum2 = 0;

            int num1 = s.nextInt();
            int num2 = s.nextInt();
            
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
                if (i % 4 == 0) {
                    if (i % 100 == 0) {
                        if (i % 400 == 0) {

                        }
                     }
                }
            }
            System.out.println(contnum2 + " " + contnum1);
        }

        s.close(); // Cierre del Scanner
    }
}
