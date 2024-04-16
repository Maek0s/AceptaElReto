import java.util.Scanner;

// falta marcar la posicion donde esta

public class p122_PD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = 0;
        int nums[] = new int[10000];

        while (c != -1) {
            int contador = 0;
            int pos = 0;
            int maxpos = 0;
            int veces = 0;
            int maxveces = 0;

            int n = 0;
            c = s.nextInt();

            if (c == -1) { break; }

            nums[0] = c;

            while (n != -1) {
                n = s.nextInt();
                contador++;
                if (n == -1) { break;}

                for (int i = 1; i < contador; i++) {
                    if (i == contador - 1) { break; }
                    nums[i] = n;
                }
            }
//            for (int i = 0; i < )

            for (int i = 0; i < contador; i++) {
                if (i == contador - 1) { }
                else {
                    if (nums[i] == nums[i + 1]) {
                        veces++;
                        pos = i;
                        if (veces >= maxveces) {
                            maxpos = i;
                            maxveces = veces;
                        }
                    } else {
                        veces = 0;
                    }
                }
            }
            maxpos -= maxveces;
            System.out.println("Max pos: "+ maxpos);
            System.out.println("Max veces: "+ maxveces);
            System.out.println("Pos: "+ pos);
            System.out.println("Veces: "+ veces);
        }
        s.close();
    }
}