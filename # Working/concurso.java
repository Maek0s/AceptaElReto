import java.util.Scanner;

public class concurso {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        String texto = "";

        while (c-- != 0) {
            int num = s.nextInt();
            int contador = 0;

            for (int i = 0; i < num; i++) {
                for (int k = 0; k < num; k++) {
                    for (int j = 0; j < num * 2; j++) {
                        if (contador % 2 == 0) {
                            texto += "#";
                            System.out.print("#");
                        } else {
                            texto += ".";
                            System.out.print(".");
                        }
                    }
                    contador++;
                }
                System.out.println(texto);
                texto = "";
            }
        }
    }
}
