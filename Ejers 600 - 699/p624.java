import java.util.Scanner;

public class p624 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = -1;

        while (t != 0) {
            int max = 0;
            int contador = -1;

            t = s.nextInt();

            if (t == 0) { break; }

            int[] nums = new int[t];
            int[] freq = new int[1000];

            for (int i = 0; i < t; i++) {
                nums[i] = s.nextInt();
            }

            for (int i = 0; i < t; i++) {
                freq[nums[i]]++;
                contador++;
                // System.out.println(i + " - " + nums[i] + ": " + freq[nums[i]]);
                for (int j = 0; j < freq.length; j++) {
                    if (freq[j] == 2) {
                        if (max < contador) {
                            max = contador;
                            // System.out.println("A: " + i + " - " + contador + " | " + max);
                        }
                        contador -= 1;
                        freq[j] -= 2;
                    }
                }
            }

            contador = 0;
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] >= 1) {
                    contador++;
                }
            }
            if (contador > max) {
                System.out.println(contador);
            } else {
                System.out.println(max);
            }
        }
    }
}