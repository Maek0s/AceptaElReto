import java.util.Scanner;

public class p148 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String horacompleta = "";

        String hora = "";
        String minuto = "";

        int operacion = 0;

        while (!horacompleta.equalsIgnoreCase("00:00")) {
            horacompleta = s.nextLine();
            if (horacompleta.equalsIgnoreCase("00:00")) { break; }

            hora = Character.toString(horacompleta.charAt(0)) + Character.toString(horacompleta.charAt(1));
            minuto = Character.toString(horacompleta.charAt(3)) + Character.toString(horacompleta.charAt(4));

            operacion = Integer.parseInt(hora) * 60;
            operacion += Integer.parseInt(minuto);
            operacion = 1440 - operacion;

            System.out.println(operacion);
        }
        s.close();
    }
}