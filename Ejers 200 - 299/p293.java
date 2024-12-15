import java.util.*;

public class p293 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t-- != 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            int e = s.nextInt();

            System.out.println((a * 6) + (b * 8) + (c * 10) + (d * (e * 2)));
        }
    }
}
