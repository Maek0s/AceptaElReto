import java.util.Scanner;

public class p100 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        int n = 0;

        while (c-- != 0) {
            n = s.nextInt();

            if (n == 6174) {
                System.out.println(0);
            }
        }

        s.close();
    }
}