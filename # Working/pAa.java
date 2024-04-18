import java.util.*;

public class pAa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		int lastnumber = 0;
		
		
		while (c-- != 0) {
			boolean resultado = false;
			boolean negative = false;
			int nums = s.nextInt();
			
			int[] numeros = new int[nums];
			
			for (int x = 0; x < nums; x++) {
				int n = s.nextInt();
				numeros[x] = n;
			}
			for (int i = 0; i < numeros.length; i++) {
				if (i == 0) { 
					lastnumber = numeros[i]; 
				} else {
					if (lastnumber > 0) {
						if (numeros[i] < 0 && lastnumber * -1 - 1 == numeros[i]) {
							System.out.println(lastnumber + " " + numeros[i] + " - negativo,secuencia");
							negative = true;
						} else if (numeros[i] > 0 && lastnumber == numeros[i]) {
							System.out.println(lastnumber + " " + numeros[i] + " - positivo,igual");
						} else {
							System.out.println(lastnumber + " B " + numeros[i]);
							break;
						}
					} else if (lastnumber < 0) {
						if (numeros[i] > 0 && lastnumber * -1 == numeros[i] + 1) {
							System.out.println(lastnumber + " " + numeros[i] + " - positivo,secuencia");
						} else if (numeros[i] < 0 && lastnumber == numeros[i]) {
							System.out.println(lastnumber + " " + numeros[i] + " - negativo,igual");
							negative = true;
						} else {
							System.out.println(lastnumber + " A " + numeros[i]);
							break;
						}
					}
					if (negative) {
						lastnumber = numeros[i] * -1;
						negative = false;
					} else {
						lastnumber = numeros[i];
					}
					
				}
			}
			System.out.println(resultado ? "CORRECTA" : "INCORRECTA");
		}

	}

}
