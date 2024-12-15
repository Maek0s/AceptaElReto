import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p740 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t-- != 0) {
            int n = s.nextInt();
            String nstring = Integer.toString(n);

            ArrayList <Integer> nums = new ArrayList<>();
            ArrayList <Integer> results = new ArrayList<>();

            int sum = 0;

            for (int i = 0; i < nstring.length(); i++) {
                nums.add(Character.getNumericValue(nstring.charAt(i)));
                sum += nums.get(i);
            }

            int limite = 1;

            results.add(sum);
            results.add(n);

            String linea = "";
            for (int i = 0; i < nums.size() - 1; i++) {
                sum = 0;
                linea = Integer.toString(nums.get(i));
                for (int j = 0; j < nums.size(); j++) {
                    if (j != i) {
                        sum += nums.get(j);
                    }
                }
                while (sum >= 10) {
                    linea = Integer.toString(Integer.parseInt(linea) + 1);
                    sum -= 10;
                }
                linea += sum;
                if (!results.contains(Integer.parseInt(linea))) {
                    results.add(Integer.parseInt(linea));
                }
            }

            for (int i = 1; i < nums.size(); i++) {
                int izq = Integer.parseInt(nstring.substring(0, i));
                int drc = Integer.parseInt(nstring.substring(i));
                if (existe((izq + drc), results)) {
                    results.add(izq + drc);
                }
            }

            Collections.sort(results);
            for (int i = 0; i < results.size(); i++) {
                System.out.print(results.get(i) + " ");
            }
            System.out.println();
            
        }
    }

    public static boolean existe (int num, ArrayList<Integer> results) {
        if (results.contains(num)) {
            return false;
        } else {
            return true;
        }
    }
}
