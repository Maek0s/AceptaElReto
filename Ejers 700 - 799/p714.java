import java.util.ArrayList;
import java.util.Scanner;

public class p714 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList <String> equipos = new ArrayList<String>();

        String c = "";

        while (!c.equals("0")) {
            c = s.nextLine();

            for (int i = 0; i < Integer.parseInt(c); i++) {
                equipos.add(c);
            }
        }
        
    }
}
