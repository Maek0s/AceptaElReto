import java.util.*;

public class p743 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = -1;

        while (num != 0) {
            num = s.nextInt();

            if (num == 0) { break; }

            ArrayList <Integer> nums = new ArrayList<>();
            int suma = 0;

            for (int i = 0; i < num; i++) {
                nums.add(s.nextInt());
                if (nums.get(i) > 1) {
                    suma += nums.get(i) / 2;
                }
            }
            System.out.println(suma);

        }

    }
}
