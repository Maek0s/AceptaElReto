import java.util.Arrays;
import java.util.Scanner;

// Wrong Answer, faltará algo por ver aún :/

public class p100_WA {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        int nums[] = new int[4];
        int n = 0;
        int veces = 0;
        int operacion = 0;

        String mayor = "";
        String menor = "";
        String longi = "";

        boolean kaprekar = false;

        while (c-- != 0) {
            operacion = 0; veces = 0; kaprekar = false;
            
            n = s.nextInt(); // num = s.next().toCharArray(); - Es una opción para meter en una array char uno a uno

            if (n == 6174) {
                System.out.println(0);
            } else {
                while (!kaprekar) {
                    mayor = ""; menor = "";
                    veces++;

                    if (operacion != 0) {
                        n = operacion;
                    }
                    longi = Integer.toString(n);
                    for (int i = 0; i < longi.length(); i++) {
                        nums[i] = Character.getNumericValue(longi.charAt(i));
                    }

                    if (nums[0] == nums[1]) {
                        if (nums[1] == nums[2]) {
                            if (nums[2] == nums[3]) {
                                System.out.println(8);
                                break;
                            }
                        }
                    }
                    Arrays.sort(nums);
                    for (int i = 0; i < nums.length; i++) {
                        menor += nums[i];
                    }
                    for (int i = nums.length - 1; i >= 0; i--) {
                        mayor += nums[i];
                    }

                    operacion = Integer.parseInt(mayor) - Integer.parseInt(menor);
                    if (operacion == 6174) {
                        kaprekar = true;
                        System.out.println(veces);
                    }
                }
            }
        }
        s.close();
    }
}