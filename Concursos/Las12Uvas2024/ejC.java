// https://aceptaelreto.com/problem/statement.php?id=773

package Las12Uvas2024;

import java.util.ArrayList;
import java.util.Scanner;

public class ejC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int limiteMed = 1;
        int tiposPolv = 1;
        boolean resultado = true;

        while (limiteMed != 0 && tiposPolv != 0) {
            resultado = true;

            limiteMed = s.nextInt();
            tiposPolv = s.nextInt();
            
            if (limiteMed == 0 && tiposPolv == 0) {
                break;
            }

            ArrayList<Integer> limitePropio = new ArrayList<>();

            for (int i = 0; i < tiposPolv; i++) {
                limitePropio.add(s.nextInt());
            }

            ArrayList<Integer> bandejaPolv = new ArrayList<>();
            for (int i = 0; i < tiposPolv; i++) {
                bandejaPolv.add(s.nextInt());
            }

            int sumaTotal = 0;
            for (int i = 0; i < bandejaPolv.size(); i++) {
                sumaTotal += bandejaPolv.get(i);

                if (bandejaPolv.get(i) > limitePropio.get(i)) {
                    resultado = false;
                    break;
                }

                if (sumaTotal > limiteMed) {
                    resultado = false;
                    break;
                }
            }

            if (resultado) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
