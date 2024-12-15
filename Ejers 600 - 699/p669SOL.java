import java.util.*;

public class p669SOL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int cases = sc.nextInt();
            if (cases == 0) break;

            Map<Integer, Integer> M = new HashMap<>();
            for (int i = 0; i < cases; i++) {
                int elem = sc.nextInt();

                // Verificar si la clave ya existe en el mapa
                if (M.containsKey(elem)) {
                    // Incrementar el valor si la clave ya existe
                    int nuevoValor = M.get(elem) + 1;
                    M.put(elem, nuevoValor);
                } else {
                    // Agregar la clave con valor inicial 1 si no existe
                    M.put(elem, 1);
                }
            }

            List<Integer> V = new ArrayList<>(M.values());
            int total2 = 0, total4 = 0;

            for (int v : V) {
                if (v == 2 || v == 3) {
                    total2++;
                } else if (v == 4 || v == 5) {
                    total4++;
                } else if (v >= 6) {
                    total4 += v / 4;    // Grupos de 4
                    v %= 4;            // Resto de dividir entre 4
                    total2 += v / 2;   // Grupos de 2
                }
            }

            int total = Math.min(total2, total4);

            // Ajustar si hay más de total4 que de total2
            while (total4 > total2) {
                total2 += 2;
                total4--;
                total = Math.max(total, Math.min(total2, total4));
            }

            System.out.println(total);
        }

        sc.close();
    }
}