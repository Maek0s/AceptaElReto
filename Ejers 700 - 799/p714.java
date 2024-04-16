import java.util.ArrayList;
import java.util.Scanner;

public class p714 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = -1;

        while (c != 0) {
            ArrayList <String> equipos = new ArrayList <String>();
            ArrayList <Integer> goles = new ArrayList<Integer>();
            
            int contequipos = 0;
            int contgoles = 0;

            c = s.nextInt();
            s.nextLine();

            if (c == 0) { break; }

            for (int i = 0; i < c; i++) {
                equipos.add(s.next());
            }

            for (int i = 0; i < (c * 2 - 2); i++) {
                goles.add(s.nextInt());
            }

            while (equipos.size() != 1) {
                if (goles.get(0) > goles.get(1)) {
                    equipos.remove(contequipos + 1);
                } else {
                    equipos.remove(contequipos);
                }

                goles.remove(0);
                if (goles.size() > 0) {
                    goles.remove(0);
                }
                contequipos++;
                contgoles++;
                if (contgoles >= equipos.size()) {
                    contgoles = 0;
                    contequipos = 0;
                }
            }
            System.out.println(equipos.get(0));
        }

        s.close(); // Close del Scanner
    }
}
