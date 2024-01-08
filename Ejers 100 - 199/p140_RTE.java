import java.util.Scanner;

public class p140_RTE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String n = "";
        int suma = 0;

        while (!n.equalsIgnoreCase("-1")) {
            n = s.nextLine();

            if (n.equalsIgnoreCase("-1")) { break; }

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
