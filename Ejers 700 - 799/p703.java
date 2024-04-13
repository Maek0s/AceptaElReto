import java.util.Scanner;

public class p703 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        s.nextLine();

        while (c-- != 0) {
            int resultado = 0;
            
            String entrada = s.next();
            s.nextInt();
            int velocidad = s.nextInt();

            if (entrada.charAt(0) != 0) {
                resultado += Character.getNumericValue(entrada.charAt(0)) * velocidad;
            }

            if (!entrada.substring(2, 4).equals("00")) {
                resultado += Integer.parseInt(entrada.substring(2, 4)) * velocidad / 60;
            }

            System.out.println(resultado);
        }
    }
}