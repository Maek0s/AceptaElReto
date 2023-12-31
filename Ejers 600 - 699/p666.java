import java.util.Scanner;

public class p666 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        s.nextLine();

        String[] quitar = {" ", ";", ".", ":",","};
        char[] t1 = new char[500000];
        char[] t2 = new char[500000];

        String entrada = "";

        for (int i = 0; i < c; i++) {
            entrada = s.nextLine();
            entrada = entrada.toLowerCase();
            // System.out.println(entrada);
            for (int j = 0; j < entrada.length(); j++) {
                if (entrada.charAt(j) == ' ' || entrada.charAt(j) == ';' || entrada.charAt(j) == '.' || entrada.charAt(j) == ':' || entrada.charAt(j) == ',' ) {
                } else {
                    t1[j] = entrada.charAt(j);
                }
            }
            for (int j = 0; j < entrada.length(); j++) {
                System.out.print(t1[j]);
            }

            entrada = s.nextLine();
            entrada = entrada.toLowerCase();
            // System.out.println(entrada);
            for (int j = 0; j < entrada.length(); j++) {
                if (entrada.charAt(j) == ' ' || entrada.charAt(j) == ';' || entrada.charAt(j) == '.' || entrada.charAt(j) == ':' || entrada.charAt(j) == ',' ) {
                } else {
                    t2[j] = entrada.charAt(j);
                }
            }

            for (int j = 0; j < entrada.length(); j++) {
                System.out.print(t2[j]);
            }

            for (int j = 0; j < entrada.length(); j++) {
                if (t1[j] != t2[j]) {
                    System.out.println("NO");
                    j = entrada.length()- 1;
                } else {
                    if (j == entrada.length() - 1) {
                        System.out.println("SI");
                    }
                }
            }
        }
        s.close();
    }
}