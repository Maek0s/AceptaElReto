import java.util.Scanner;

public class pA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();

        while (c-- != 0) {
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            int n3 = s.nextInt();

            if (n1 < n2 && n2 < n3) {
                System.out.println("STAIR");
            } else if (n1 < n2 && n2 > n3) {
                System.out.println("PEAK");
            } else {
                System.out.println("NONE");
            }
        }
    }
}
