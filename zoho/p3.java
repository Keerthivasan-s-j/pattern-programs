/*

Input: 5
Output:
    *
   ***
  *****
 *******
*********

 */

package zoho;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i<n; i++) {
            int space = n - i -1;
            for (int j = 0; j<space; j++) {
                System.out.print("  ");
            }
            int star = i * 2 + 1;
            for (int j = 0; j<star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
