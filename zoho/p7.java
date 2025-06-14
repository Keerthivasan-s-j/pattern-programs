package zoho;

import java.util.Scanner;

public class p7 {
    public static void snakePattern(int n, int m, int[][] mat) {
        System.out.println("Snake Pattern");
        for (int i = 0; i<n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j<m; j++) {
                    System.out.print(mat[i][j] + " ");;
                }
            }
            else {
                for (int j = m-1; j>=0; j--) {
                    System.out.print(mat[i][j] + " ");;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        snakePattern(n, m, mat);
    }
}