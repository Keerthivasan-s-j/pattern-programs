package zoho;

import java.util.Scanner;

/*

Input: 5
Output:
    *
   ***
  *****
   ***
    *

 */

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int mid = n / 2 + 1;
        for (int i = 0; i<mid; i++) {
            int space = mid - i -1;
            for (int j = 0; j<space; j++) {
                System.out.print(" ");
            }
            int star = i * 2 + 1;
            for (int j = 0; j<star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = mid-2; i>=0; i--) {
            int space = mid - i -1;
            for (int j = 0; j<space; j++) {
                System.out.print(" ");
            }
            int star = i * 2 + 1;
            for (int j = 0; j<star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
