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

            Collections.sort(letras1);

            for (int i = 0; i < letras1.size(); i++) {
                System.out.print(letras1.get(i));
            }
        }
    }
}
