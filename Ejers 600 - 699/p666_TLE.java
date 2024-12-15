import java.util.Scanner;

public class p666_TLE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String texto1 = "";
        String texto2 = "";

        int c = s.nextInt();
        s.nextLine();
       
        while (c-- != 0) {
            texto1 = s.nextLine()
                      .replace(".", "")
                      .replace(",", "")
                      .replace(":", "")
                      .replace(";", "")
                      .replace(" ", "");
            texto2 = s.nextLine()
                      .replace(".", "")
                      .replace(",", "")
                      .replace(":", "")
                      .replace(";", "")
                      .replace(" ", "");

            if (texto1.equalsIgnoreCase(texto2)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        s.close();
    }
}