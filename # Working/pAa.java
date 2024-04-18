import java.util.Scanner;

public class pAa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		int lastnumber = 0;
		
		while (c-- != 0) {
			boolean resultado = true;
			boolean negative = false;
			int nums = s.nextInt();
			
			int[] numeros = new int[nums];
			
			for (int x = 0; x < nums; x++) {
				int n = s.nextInt();
				numeros[x] = n;

				if (x == 0) {
					lastnumber = numeros[x];
				} else {
					if (lastnumber < 0 && n < 0 || lastnumber > 0 && n > 0) {
						if (lastnumber != n) {
							resultado = false;
						}
					}
				}
				lastnumber = numeros[x];
			}

			if (!resultado) {
				System.out.println("INCORRECTA");
			} else {
				for (int i = 0; i < numeros.length; i++) {
					if (i == 0) {
						lastnumber = numeros[i];
					} else {
						if (Math.abs(numeros[i]) > Math.abs(lastnumber) || lastnumber == numeros[i]) {
							// System.out.println(numeros[i] +" . " + lastnumber);
						} else {
							// System.out.println(lastnumber + " " + numeros[i]);
							resultado = false;
							break;
						}
						lastnumber = numeros[i];
					}
				}
				System.out.println(resultado ? "CORRECTA" : "INCORRECTA");
			}
		}
	}
}
