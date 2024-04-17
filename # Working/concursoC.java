import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class concursoC {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        s.nextLine();
        String cambio = "";

        while (c-- != 0) {
            String hora = s.nextLine();
            int txt = Integer.parseInt(hora.substring(0, 2));
            //System.out.println(txt);
            if (txt < 12) {
                System.out.println(hora + " AM");
            } else if (txt == 0) {
                System.out.println("12:" + hora.substring(3,hora.length()) + " AM");
            } else if (txt == 12) {
                System.out.println("12:" + hora.substring(3,hora.length()) + " PM");
            } else {
                SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
                Date fecha = formato.parse(hora);
                System.out.print(new SimpleDateFormat("KK:mm").format(fecha));
                System.out.println(" PM");
            }
        }
    }
}
