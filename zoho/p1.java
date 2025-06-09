package zoho;

// Output
// 2
// zohocorporationteam
// hacker
// 
// z o h o c o r 
//           p   
//         o     
//       r       
//     a         
//   t           
// i o n t e a m 
// 
// NO


import java.util.*;

class p1 {
    public static void pattern(int n, String str) {
        int ind = 0;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                 if (i == 0 || i == n-1 || j == n-i-1) {
                     System.out.print(str.charAt(ind++) + " ");
                 }
                 else {
                     System.out.print("  ");
                 }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<t; i++) {
            String str = sc.nextLine();
            int len = str.length();
            if ((len + 2) % 3 != 0) {
                System.out.println("NO");
            }
            else {
                int n = (len + 2) / 3;
                pattern(n, str);
            }
        }
        sc.close();
    }
}