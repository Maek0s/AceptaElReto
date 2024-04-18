import java.util.*;

public class pB {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		s.nextLine();
		
		while (c-- != 0) {
			String n = s.nextLine();
			
			String pparte = n.substring(0,2);
			String sparte = n.substring(n.length() - 2,n.length());
			
			int contadoruno = 0;
			int contadorcero = 0;
			
			if (!pparte.equals(sparte)) {
				System.out.println("ERROR");
			} else {
				for (int i = 0;i < n.length(); i++) {
					if (Character.toString(n.charAt(i)).equals("1")) {
						contadoruno++;
					} else if (Character.toString(n.charAt(i)).equals("0")) {
						contadorcero++;
					}
				}
				if (contadoruno == contadorcero) {
					System.out.println("EQUILIBRADA");
				} else {
					System.out.println("ERROR");
				}
			}
		}
	}

}
