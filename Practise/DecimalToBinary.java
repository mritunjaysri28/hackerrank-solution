import java.util.Scanner;

/**
 * Created by DEVIL on 15-Apr-17.
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        int count = 0, largest = 0;
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        scan.close();
        long n = Long.parseLong(Integer.toBinaryString(m));
        System.out.println(n);
        while (n != 0) {
            long reminder = (n % 10);
            if (reminder == 1) {
                count += 1;
            } else {
                count = 0;
            }
            if (count > largest) {
                largest = count;
            }
            n /= 10;
        }
        System.out.println(largest);
    }
}
