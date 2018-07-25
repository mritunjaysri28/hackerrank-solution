import java.util.Scanner;

/**
 * Created by DEVIL on 10-Apr-17.
 */
public class Reverse_array {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<10; i++) {
            arr[i] = scan.nextInt();
        }

        int c[] = reverse(arr);
        for(int i=0;i<10;i++) {
            System.out.print(c[i] + " ");
        }
    }

    static int[] reverse(int arr[]) {
        int end = arr.length;
        int start=0;
        for(int i=start; i>=end; i++) {
            int temp=arr[i];
            arr[i] = arr[end];
            arr[end]=temp;
            end-=1;
        }
        return arr;
    }
}

