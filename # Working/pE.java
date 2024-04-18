import java.util.*;

public class pE {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		
		ArrayList <Integer> nums = new ArrayList<Integer>();
		ArrayList <String> nomb = new ArrayList <String>();
		
		for (int i = 0; i < c; i++) {
			nums.add(s.nextInt());
			nomb.add(s.next());
		}
		
		for (int i = 0; i < nums.size(); i++) {
			for (int j = 0; j < nums.size(); j++) {
				if (nums.get(i) == nums.get(j) && i != j) {
					int numero = nums.get(i);
					//System.out.println("eliminar: " + numero);
					while (nums.indexOf(numero) != -1) {
						int posicion = nums.indexOf(numero);
						//System.out.println(posicion);
						if (nums.indexOf(numero) == -1) {
							break;
						} else {
							nums.remove(posicion);
							nomb.remove(posicion);
						}
					}
				}
			}
		}
		
		int min = 0;
		
		if (nums.size() == 0) {
			System.out.println("-1");
		} else {
			min = nums.get(0);
			int nombre = 0;
			
			for (int i = 0; i < nums.size(); i++) {
				if (min > nums.get(i)) {
					min = nums.get(i);
					nombre = i;
				}
			}
			
			System.out.println(nomb.get(nombre));
		}
		
	}

}
