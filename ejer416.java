import java.util.Scanner;

public class p416 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = -1;
        int contador = 0;
        int fix = 0;
        int y = 0;
        int x = 0;
        String n = "";
        boolean respuesta = false;

        while (c != 0) {
            c = s.nextInt();
            s.nextLine();

            if (c == 0) { break; }

            String[][] fecha = new String[c][2];
            
            for (int i = 0; i < c; i++) {
                n = s.nextLine();
                
                String[] dias = n.split("/");

                fecha[contador][fix] = dias[0];
                fix++;
                fecha[contador][fix] = dias[1];
                fix++;
                contador++;
                fix = 0;
                /*for (int j = 0; j < fecha.length; j++) {
                	for (int k = 0; k < fecha[0].length; k++) {
                		System.out.print(fecha[j][k]+" ");
                	}
                	System.out.println();
                }*/
                for (int j = 1; j < fecha.length; j++) {
                	for (int k = 0; k < 1; k++) {
            			if (fecha[y][x].equals(fecha[j][k])) {
                			if (fecha[y][x + 1].equals(fecha[j][k + 1])) {
                				i = c;
                				respuesta = true;
                				System.out.println("SI");
                			}
                		}
                	}
            	}
            }
            if (!respuesta) {
            	System.out.println("NO");
            }
            respuesta = false;
        }
    }
}
