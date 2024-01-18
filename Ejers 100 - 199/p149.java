import java.util.Scanner;

// AC: https://aceptaelreto.com/problem/submission.php?id=837788

public class p149 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = 5;
        int v = 0;

        while (s.hasNext()) {
            int m = 0;
            t = s.nextInt();
            for (int i = 0; i < t; i++) {
                v = s.nextInt();
                if (v > m) {
                    m = v;
                }
            }
            System.out.println(m);
        }
        s.close();
    }
}