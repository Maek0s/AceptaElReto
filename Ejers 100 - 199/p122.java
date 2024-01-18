import java.util.Scanner;

// falta marcar la posicion donde esta

public class p122 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = 0;
        int n = 0;
        int nums[] = new int[1000];

        int altura = 0; // altura
        int valtura = 1; // veces en esa altura
        int mvaltura = 1; // mayor veces
        int maltura = 0; // mayor veces en esa altura

        while (c != -1) {
            c = s.nextInt();
            if (c == -1) { break; }

            nums[0] = c;
            int contador = 1;
            while (n != -1) {
                n = s.nextInt();
                if (n == -1) { break;}

                nums[contador] = n;
                contador++;
            }
            for (int i = 0; i < contador; i++) {
                //System.out.println(nums[i]);
                if (i == 0) { altura = nums[0]; valtura++; }
                else {
                    if (i == contador - 1) {
                    } else {
                        if (altura == nums[i + 1]) {
                            valtura++;
                        } else {
                            mvaltura = valtura;
                            maltura = altura;
                            altura = nums[i + 1];
                            valtura = 1;
                        }
                    }
                }
                
            }
            System.out.println(mvaltura);
            System.out.println(maltura);
        }
        s.close();
    }
}