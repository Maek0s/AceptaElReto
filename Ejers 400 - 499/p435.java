import java.util.Scanner;

public class p435 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int entrada = 0;

        while (entrada != -1) {
            int veces = 0;
            boolean subnormal = true;

            entrada = s.nextInt();
            String longi = Integer.toString(entrada);

            for (int i = 0; i < longi.length(); i++) {
                if (i != longi.length() - 1) {
                    char one = longi.charAt(i);
                    char two = longi.charAt(i + 1);
                    if (one == two) {
                        veces++;
                        System.out.println(veces);
                    } else if (one == (Character.getNumericValue(two + 1))) {
                        System.out.println("sigue");
                    } else {
                        subnormal = false;
                    }
                }
            }
            if (subnormal) {
                System.out.println("subnormal");
            } else {
                System.out.println("no subnormal");
            }
        }
    }
}
