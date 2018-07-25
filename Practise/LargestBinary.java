package com.company;

import java.util.Scanner;

/**
 * Created by DEVIL on 07-Apr-17.
 */
public class LargestBinary {

    public static void main(String[] args) {
        int count = 0, largest = 0;
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        scan.close();
        long n = Long.parseLong(Integer.toBinaryString(m));
        System.out.print("Consecutive 1 of" + n + " -> ");
        while (n!=0) {
            long reminder =  (n%10);
            if (reminder==1) {
                count += 1;
            } else {
                count = 0;
            }
            if(count>largest) {
                largest = count;
            }
            n/=10;
        }
        System.out.print(largest);
    }
}



/*
-------Decimal to Binary----------
if (n == 0) {
            System.out.print("0000");
        } else {
            while (n > 0) {
                remeinder = n % 2;
                n = n / 2;
                binary = remeinder + binary;
            }
            System.out.print(binary);
        }
 */