import java.util.Scanner;

public class p416_WA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = -1;
        int contador = 0;
        int fix = 0;
        int y = 0;
        int x = 1;
        String n = "";
        boolean respuesta = false;
        boolean cierre = false;

        while (c != 0) {
            c = s.nextInt();
            s.nextLine();

            if (c == 0) { break; }

            String[][] fecha = new String[c][2];
            
            for (int i = 0; i < c; i++) {
                n = s.next();
                
                String[] dias = n.split("/");

                fecha[contador][0] = dias[0];
                fecha[contador][1] = dias[1];
                contador++;
                fix = 0;
            }
            contador = 0;

            while (!cierre) {
                if (fecha[y][0].equals(fecha[x][0])) {
                    if (fecha[y][1].equals(fecha[x][1])) {
                        cierre = true;
                        respuesta = true;
                        break;
                    }
                }
                x++;
                if (x == y) {
                    x++;
                }
                
                if (x == c) {
                    y++;
                    x = 0;
                }
                if (y == c) {
                    break;
                }
            }

            if (respuesta) {
            	System.out.println("SI");
            } else {
            	System.out.println("NO");
            }
            respuesta = false;
        }
    }
}