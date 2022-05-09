package leetcode.eee001history;

import java.util.Scanner;

public class ccc006pr {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        String demo = x.nextLine();
        String showstr = "";
        char s = 98;

        for (int i = 0; i < demo.length(); i++) {
            System.out.println(demo.charAt(i));
            int x2 = demo.charAt(i) + 1 - 32;
            System.out.print(x2);
        }
    }
    public static void show(String x){
        x.matches("\\w[a-z]");
        x.matches("\\w[0-9]");
        x.matches("\\w[A-Z]");
    }
}
