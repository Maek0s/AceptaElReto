import java.util.Scanner;

public class p675PD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        
        while (c != 0) {
            int n = s.nextInt();

            int[] nums = new int[Integer.toString(n).length()];
            for (int i = 0; i < Integer.toString(n).length(); i++) {
                nums[i] = Character.getNumericValue(Integer.toString(n).charAt(i));
                System.out.println(nums[i]);
            }
        }

        s.close();
    }
}
