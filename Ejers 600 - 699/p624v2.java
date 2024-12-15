import java.util.*;

public class p624v2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = -1;
        int prueba = 0;

        while (t != 0) {
            prueba++;
            t = s.nextInt();

            if (t == 0) {
                break;
            }

            HashMap <Integer, Integer> nums = new HashMap<>();
            ArrayList <Integer> lista = new ArrayList<>();

            int solitarios = 0;
            int max = 1;

            for (int i = 0; i < t; i++) {
                int num = s.nextInt();

                if (!lista.contains(num)) {
                    lista.add(num);
                }

                if (nums.get(num) == null) {
                    nums.put(num, 1);
                    solitarios++;
                } else {
                    // System.out.println("ASD");
                    int valor = nums.get(num) + 1;
                    nums.put(num, valor);
                }
                if (nums.get(num) == 2) {
                    nums.put(num, nums.get(num) - 2);
                    if (max < solitarios) {
                        max = solitarios;
                    }
                    solitarios--;
                }
            }
            // System.out.println(nums);
            int contador = 0;
            for (int i = 0; i < lista.size(); i++) {
                if (nums.get(lista.get(i)) == 1) {
                    contador++;
                }
            }
            if (contador > max) {
                System.out.println(prueba + ": " + contador);
            } else {
                System.out.println(prueba + ": " + max);
            }
        }
    }
}
