import java.util.HashMap;
import java.util.Scanner;

public class p624_pruebas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int t = s.nextInt();
            if (t == 0) break;

            HashMap<Integer, Integer> nums = new HashMap<>();
            int solitarios = 0;
            int maxSolitarios = 0;

            for (int i = 0; i < t; i++) {
                int num = s.nextInt();
                nums.put(num, nums.getOrDefault(num, 0) + 1);

                if (nums.get(num) % 2 == 1) {
                    solitarios++;
                } else {
                    solitarios--;
                }

                if (solitarios > maxSolitarios) {
                    maxSolitarios = solitarios;
                }
            }

            System.out.println(maxSolitarios);
        }

        s.close();
    }
}
