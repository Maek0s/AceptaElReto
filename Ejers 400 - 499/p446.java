import java.util.ArrayList;
import java.util.Scanner;

public class p446 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String nombre = "";
        int numnombres = 0;
        int c = s.nextInt();

        for (int i = 0; i < c; i++) {
            ArrayList<String> listanietos = new ArrayList<String>();

            nombre = s.next();
            System.out.println("N:" + nombre);
            numnombres = s.nextInt();

            if (numnombres == 1 || numnombres == 0) {
                System.out.println("FALSA");
            } else {
                for (int j = 0; j < numnombres; j++) {
                    listanietos.add(s.next());
                }

                if (listanietos.get(listanietos.size() - 1).equalsIgnoreCase(nombre)) {
                    System.out.println("VERDADERA");
                } else {
                    System.out.println("FALSA");
                }
            }
            nombre = "";
        }
    }
}
