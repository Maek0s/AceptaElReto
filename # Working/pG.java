import java.util.*;

public class pG {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int p = s.nextInt();
		s.nextLine();
		
		String[] a = null;
		ArrayList <String> habilidades = new ArrayList<String>();
		ArrayList <String> requisitos = new ArrayList<String>();
		int contador = 0;
		
		for (int i = 0; i < p; i++) {
			String txt = s.nextLine();
			int pos = txt.indexOf(" ");
			
			txt = txt.substring(pos + 1, txt.length());
			a = txt.split(" ");
			
			for (int j = 0; j < a.length; j++) {
				habilidades.add(a[j]);
			}
			
		}
		
		int c = s.nextInt();
		s.nextLine();
		
		for (int i = 0; i < c; i++) {
			boolean val = false;
			int contrequi = 0;

			String txt = s.nextLine();
			int pos = txt.indexOf(" ");
			
			txt = txt.substring(pos + 1, txt.length());
			a = txt.split(" ");
			
			for (int j = 0; j < a.length; j++) {
				requisitos.add(a[j]);
			}
			
			for (int j = 0; j < habilidades.size(); j++) {
				for (int k = 0; k < requisitos.size(); k++ ) {
					if (requisitos.get(k).equals(habilidades.get(j))) {
						//System.out.println("pass");
						requisitos.remove(k);
						contrequi++;
						if (contrequi == requisitos.size()) {
							System.out.println("POSIBLE");
							val = true;
						}
					}
				}
			}
			requisitos.clear();
			if (!val) {
				System.out.println("IMPOSIBLE");
			}
		}
		
	}

}
