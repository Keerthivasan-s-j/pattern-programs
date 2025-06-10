package zoho;

import java.util.Scanner;

/*
 
Input : 5
Output: 

    * 
   * *
  * * *
 * * * *
* * * * *

 */

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i<n; i++) {
            int space = n - i - 1;
            for (int j = 0; j<space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
