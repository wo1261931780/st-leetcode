package leetcode.eee001history;

import java.util.Scanner;

public class ccc003practice {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int i = x.nextInt();
        if (i != 0) {
            show();
        }
    }

    public static void show() {
        int jw = 0;
        int cash = 100;

        for (int jw_sum =cash/ 5; jw <= jw_sum; jw++) {
            int jm = 0;
            int cash_now = cash - 5 * jw;
            for (int jm_num = cash_now / 3; jm <= jm_num; jm++) {
                // for (int jc_num = 100 * 3; jc <= jc_num; jc++) {
                //     boolean x1 = jw * 5 + jm * 3 + jc / 3 == 100;
                //     boolean x2 = jw + jm + jc == 100;
                //     if (x1 && x2) {
                //         break;
                //     }
                // }
                int jc = 100 - jw - jm;
                if (jc % 3 == 0 && 5 * jw + 3 * jm + jc / 3 == 100) {
                    System.out.println(jw + " " + jm + " " + jc);
                }
            }
        }
    }

    //2022年2月9日21:59:06，正确思路：
    public class Main {
        public static void main(String[] args)  {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextInt()) {
                F(sc.nextInt());
            }
        }


        public static void F(int num) {
//        5x+3y+z/3=100;
//        x+y+z=100;
//        简化得 7x+4y=100;
            int x,y,z;
            for(x = 0; x<=14;x++){
                if((100 - 7*x) % 4 == 0){
                    y = (100 - 7*x) / 4;
                    z = 100-x-y;
                    System.out.print(x +" ");
                    System.out.print(y +" ");
                    System.out.print(z +" ");
                    System.out.println();
                }
            }
        }
    }



}
