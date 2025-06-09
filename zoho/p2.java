/*
 * Output
 input : program
            g 
          g r 
        g r a 
      g r a m 
    g r a m p 
  g r a m p r 
g r a m p r o 

 */

package zoho;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int mid =  n / 2;
        for (int i = 0; i<n; i++) {
            int space = n - i -1;
            for (int j = 0; j<space; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j<i+1; j++) {
                int ind = (mid + j) % n;
                System.out.print(str.charAt(ind) + " ");
            }
            System.out.println();
        }
    }
}
