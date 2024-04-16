import java.text.ParseException;
import java.util.Scanner;

public class p232 {
    public static void main (String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);

        String entrada = "";
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (!entrada.equals("0 0 0 0 0 0")) {
            entrada = s.nextLine();

            if (entrada.equals("0 0 0 0 0 0")) {
                System.out.println("0");
                break;
            }
            System.out.println("asd");
            String[] fechas = entrada.split(" ");

            
            // for (int i = 0; i < fechas.length; i++) {
            //     System.out.println(fechas[i]);
            // }

            

        }
    }
}
