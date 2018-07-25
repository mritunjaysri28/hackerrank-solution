import java.util.Scanner;

/**
 * Created by DEVIL on 10-Apr-17.
 */
public class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int result = LCM(x, y);
        System.out.print(result);
    }

    static int LCM(int x, int y) {
        int a = (x>y)?x:y;
        while(true) {
            if(a%x==0 && a%y==0)
                return a;
            ++a;
        }
    }

}
