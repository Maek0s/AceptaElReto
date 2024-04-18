import java.util.*;

public class pD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		s.nextLine();
		
		while (c-- != 0) {
			String[][] tablero = new String[3][3];
			
			int contador = 0;
			for (int j = 0; j < 3; j++) {
				String entrada = s.nextLine();

				for (int i = 0; i < 3; i++) {
					tablero[contador][i] = Character.toString(entrada.charAt(i));
				}
				contador++;
			}
			
			if (tablero[1][1].equals("X")) {
				System.out.println("CRUZ");
			} else if (tablero[1][1].equals("O")) {
				System.out.println("CIRCULO");
			} else {
				System.out.println("IMPOSIBLE");
			}
		}
	}
}
