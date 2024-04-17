import java.util.Scanner;

// TEMA NEGATIVOS, REVISAR ESCENARIOS

public class p100 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int c = s.nextInt();
        s.nextLine();

        while (c-- != 0) {
            int num = s.nextInt();
            int vueltas = 0;
            String numvuelta = "";
            boolean kaprekar = false;

            while (!kaprekar) {
                numvuelta = darVuelta(num);

                if (num == 6174) { kaprekar = true; break; }
                if (num == Integer.parseInt(numvuelta)) { vueltas = 8; break; }

                vueltas++;

                num = num - Integer.parseInt(numvuelta);
            }

            System.out.println(vueltas);
        }
    }

    public static String darVuelta (int num) {
        String numvuelta = "";
        String numlength = Integer.toString(num);
        System.out.println(numlength);
        for (int i = 0; i < numlength.length(); i++) {
            numvuelta += numlength.charAt(numlength.length() - i - 1);
            System.out.println(numvuelta);
        }

        return numvuelta;
    }
}