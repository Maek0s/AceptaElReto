import java.util.Scanner;

public class p595 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();

        while (c-- != 0) {
            int num = s.nextInt();

            int len = Integer.toString(num).length() - 2;
            String result = "";

            for (int i = 0; i < len; i++) {
                result += Integer.toString(num).charAt(i);
            }

            System.out.println(result);
        }
    }
}

    