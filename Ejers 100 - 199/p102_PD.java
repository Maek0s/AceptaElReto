import java.util.Scanner;

public class p102_PD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean fin = true;

        while (fin) {
            String entrada = s.nextLine();
            System.out.println(codificar(entrada));
            //for (int i = 0; i < )
        }

        s.close();
    }

    public static String codificar (String entrada) {
        String resultado = "";

        for (int i = 0; i < entrada.length(); i++) {
            //resultado = Character.toString(entrada.charAt(i)) + 1;
            char letra = (char) (entrada.charAt(i) + 1);
            resultado += letra;
        }

        return resultado;
    }
}
