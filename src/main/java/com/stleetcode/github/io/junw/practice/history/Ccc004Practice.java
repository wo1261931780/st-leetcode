package com.stleetcode.github.io.junw.practice.history;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * @author junw
 */
@Slf4j
public class Ccc004Practice {
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
                    log.info(String.valueOf(i));
                } else {
                    log.info(i + "+");
                }
            }
            //}else{
            //  int demoo=num*num;
            //for(int i=demoo-num+1,j=0;j<num;i+=2,j++){
            //  log.info(i+"+");
            //}
            //}
        }
    }
}


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
//             log.info(sb);
//         }
//     }
// }
