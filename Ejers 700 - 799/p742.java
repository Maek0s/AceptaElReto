import java.util.Scanner;

public class p742 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        s.nextLine();

        while (t-- != 0) {
            String n = s.nextLine();

            long bueno = 0;
            long malo = 0;
            long uno = 0;
            long cero = 0;

            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == '1') {
                    uno++;
                } else if (n.charAt(i) == '0') {
                    cero++;
                    if (i != n.length() - 1) {
                        if (n.charAt(i + 1) == '0') {
                            bueno++;
                        } else {
                            malo++;
                        }
                    }
                }
            }

            if (n.charAt(0) == '0' && n.charAt(n.length() - 1) == '0') {
                bueno++;
            } else if (n.charAt(0) == '1' && n.charAt(n.length() - 1) == '0') {
                malo++;
            }

            // System.out.println(malo + " " + bueno + " " + cero + " " + uno);

            long prob1 = (bueno * (cero + uno));
            long prob2 = (cero * (bueno + malo));

            // System.out.println(prob1 + " " + prob2);

            if (prob1 > prob2) {
                System.out.println("No girar");
            } else if (prob1 < prob2) {
                System.out.println("Girar");
            } else if (prob1 == prob2) {
                System.out.println("Da igual");
            }
        }
    }
}
