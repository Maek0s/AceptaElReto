// https://aceptaelreto.com/problem/statement.php?id=774

package Las12Uvas2024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ejD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = 1;

        while (c != 0) {
            c = s.nextInt();

            if (c == 0) {
                break;
            }

            ArrayList<Integer> colores = new ArrayList<>();
            ArrayList<Integer> repes = new ArrayList<>();

            for (int i = 0; i < c; i++) {
                colores.add(s.nextInt());
            }

            int sumaColores = 0;

            for (int i = 0; i < colores.size(); i++) {
                int num = colores.get(i);

                if (repes.contains(num)) {
                    continue;
                }

                repes.add(num);
                int first = colores.indexOf(num);
                int last = colores.lastIndexOf(num);

                if (first == last) {
                    continue;
                } else {
                    sumaColores += last - first;
                }
            }

            System.out.println(sumaColores);
        }
    }
}