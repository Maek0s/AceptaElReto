import java.util.Scanner;

public class pD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		s.nextLine();
		
		while (c-- != 0) {
			String[][] tablero = new String[3][3];

			int contadorX = 0;
			int contadorO = 0;
			int contador = 0;

			for (int j = 0; j < 3; j++) {
				String entrada = s.nextLine();

				for (int i = 0; i < 3; i++) {
					tablero[contador][i] = Character.toString(entrada.charAt(i));
					if (tablero[contador][i].equals("X")) { contadorX++; }
					if (tablero[contador][i].equals("O")) { contadorO++; }
				}
				contador++;
			}
			
			if (tablero[1][1].equals("X")) {
				if (contadorX == contadorO || contadorX + 1 == contadorO) {
					System.out.println("CRUZ");
				} else {
					System.out.println("IMPOSIBLE");
				}
			} else if (tablero[1][1].equals("O")) {
				if (contadorO == contadorX || contadorO + 1 == contadorX) {
					System.out.println("CIRCULO");
				} else {
					System.out.println("IMPOSIBLE");
				}
			} else {
				System.out.println("IMPOSIBLE");
			}
		}
	}
}
