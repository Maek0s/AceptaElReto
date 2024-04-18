import java.util.*;

public class p260 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        s.nextLine();

        while (c-- != 0) {
            String texto1 = s.nextLine();
            String texto2 = s.nextLine();

            ArrayList <Character> letras1 = new ArrayList<Character>();
            ArrayList <Character> letras2 = new ArrayList<Character>();

            for (int i = 0; i < texto1.length(); i++) {
                letras1.add(texto1.charAt(i));
            }

            System.out.println("\n" + "BBB");

            for (int i = 0; i < texto2.length(); i++) {
                letras1.add(texto2.charAt(i));
            }

            Collections.sort(letras1);
            Collections.sort(letras2);

            texto1 = "";
            texto2 = "";

            for (int i = 0; i < letras1.size(); i++) {
                texto1 += letras1.get(i);
            }
            System.out.println("\n" + "AAA");

            for (int i = 0; i < letras2.size(); i++) {
                texto2 += letras2.get(i);
            }
            
            if (texto1.equalsIgnoreCase(texto2)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
