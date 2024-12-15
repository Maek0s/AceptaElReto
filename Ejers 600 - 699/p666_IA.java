import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p666_IA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        s.nextLine();

        for (int i = 0; i < c; i++) {
            String texto1 = s.nextLine();
            String texto2 = s.nextLine();

            if (areCalambur(texto1, texto2)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        s.close();
    }

    private static boolean areCalambur(String texto1, String texto2) {
        Map<Character, Integer> charCountMap1 = getCharacterCountMap(texto1);
        Map<Character, Integer> charCountMap2 = getCharacterCountMap(texto2);

        return charCountMap1.equals(charCountMap2);
    }

    private static Map<Character, Integer> getCharacterCountMap(String text) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if (charCountMap.containsKey(ch)) {
                    charCountMap.put(ch, charCountMap.get(ch) + 1);
                } else {
                    charCountMap.put(ch, 1);
                }
            }
        }

        return charCountMap;
    }
}
