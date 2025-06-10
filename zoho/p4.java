package zoho;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int num = 1;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.printf("%3d ", num++);
            }
            System.out.println();
        }
    }
}
