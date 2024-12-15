/*
  Autor: @Maek0s
  Problema: Lámpara de pared
  Enlace: https://aceptaelreto.com/problem/statement.php?id=669
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p669 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = -1;

        while (n != 0) {
            n = s.nextInt();

            if (n == 0) break;

            Map<Integer, Integer> cantidadVarillas = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int longLampara = s.nextInt();

                // Asigna un valor dependiendo si ya existe o no
                if (cantidadVarillas.containsKey(longLampara)) {
                    // Si existe, incrementar el conteo
                    int nuevoValor = cantidadVarillas.get(longLampara) + 1;
                    cantidadVarillas.put(longLampara, nuevoValor);
                } else {
                    // Si no existe, inicializar con 1
                    cantidadVarillas.put(longLampara, 1);
                }
            }

            int maxLamparas = 0;

            // Saca la lista de todas las key
            for (int l1 : cantidadVarillas.keySet()) {
                for (int l2 : cantidadVarillas.keySet()) {
                    if (l1 == l2) {
                        // Saco las parejas disponibles y luego las dividido en 3 para sacar la cantidad de
                        // lamparas posibles si son de igual longitud
                        int dobleDisponible = cantidadVarillas.get(l1) / 2;
                        int lamparasIguales = dobleDisponible / 3;
                        maxLamparas = Math.max(maxLamparas, lamparasIguales);
                        
                    } else if (l1 < l2) {
                        int paresHorizontales = cantidadVarillas.get(l1) / 2;
                        int paresVerticales = cantidadVarillas.get(l2) / 4;
                        
                        // Saca el mínimo de lamparas posibles, si uno tiene 10 pares y otro 4, se elige el 4 ya que sino faltaría
                        int minimoPosibles = Math.min(paresHorizontales, paresVerticales);

                        // Si lo supera a anteriores ocasiones lo reemplaza
                        if (minimoPosibles > maxLamparas) {
                            maxLamparas = minimoPosibles;
                        }
                    }
                }
            }
            System.out.println(maxLamparas);
        }
    }
}
