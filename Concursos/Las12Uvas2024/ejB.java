// https://aceptaelreto.com/problem/statement.php?id=772

package Las12Uvas2024;

import java.util.Scanner;

public class ejB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = 1;
        int avistamientos = 1;

        while (num != 0 && avistamientos != 0) {
            num = s.nextInt();
            avistamientos = s.nextInt();
            
            if (num == 0 && avistamientos == 0) {
                break;
            }

            int min = num + 74 * avistamientos;
            int max = num + 79 * avistamientos;
            System.out.println("[" + min + " .. " + max + "]");
        }
    }
}
