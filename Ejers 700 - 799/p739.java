import java.util.*;

public class p739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t-- != 0) {
            int an = s.nextInt();
            int An = s.nextInt();
            int al = s.nextInt();
            int Al = s.nextInt();

            int hrz = (int) (Math.ceil((double) an / al) * Math.ceil((double) An / Al));
            int vrt = (int) (Math.ceil((double) an / Al) * Math.ceil((double) An / al));

            System.out.println(Math.min(hrz,vrt));
        }
    }
}
