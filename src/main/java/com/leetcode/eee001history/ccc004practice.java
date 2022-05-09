package leetcode.eee001history;

import java.util.Scanner;

public class ccc004practice {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while (x.hasNextInt()) {
            int num = x.nextInt();
            if (num <= 0 || num > 100) {
                return;
            }
            //if(num%2==0){
            int demoj = num * num;
            for (int i = demoj - num + 1, j = 0; j < num; i += 2, j++) {
                if (j == num - 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + "+");
                }
            }
            //}else{
            //  int demoo=num*num;
            //for(int i=demoo-num+1,j=0;j<num;i+=2,j++){
            //  System.out.print(i+"+");
            //}

            //}

        }
    }

}
//µÈ²îÊýÁÐ£º
//
//import java.util.Scanner;
//
// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         while (in.hasNextInt()) {
//             int n = in.nextInt();
//             long sum = (long)Math.pow(n,3);
//             int a1 = (int)sum/n - (n - 1);
//             StringBuilder sb = new StringBuilder(Integer.toString(a1));
//             for(int i = 1; i < n; i++){
//                 a1 = a1 + 2;
//                 sb.append("+");
//                 sb.append(a1);
//             }
//             System.out.println(sb);
//         }
//     }
// }
