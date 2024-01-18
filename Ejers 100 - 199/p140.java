import java.util.Scanner;

// AC: https://aceptaelreto.com/problem/submission.php?id=837775

public class p140 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String n = "0";
        int suma = 0;

        while (Integer.parseInt(n) >= 0) {
            n = s.nextLine();

            if (Integer.parseInt(n) < 0) {
                break;
            }

            int[] numeros = new int[n.length()];
            suma = 0;

            for (int i = 0; i < n.length(); i++) {
                numeros[i] = Character.getNumericValue(n.charAt(i));
                suma += numeros[i];
            }
            for (int i = 0; i < n.length(); i++) {
                if (i == n.length() - 1) {
                    System.out.println(numeros[i] + " = " + suma);
                } else {
                    System.out.print(numeros[i]+" + ");
                }
            }
        }
        s.close();
    }
}
