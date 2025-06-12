package zoho;

import java.util.Scanner;

/*
 
INPUT : 5

OUTPUT

1       5 
  2   4   
    3     
  2   4   
1       5 

 */

public class p8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                if (i == j || j == n - i -1) {
                    System.out.print(j+1 + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}