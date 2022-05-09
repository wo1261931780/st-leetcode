package leetcode.eee002deke_code.aaa009_20220409;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220409
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-16-22  星期六
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 * <p>
 * 数据范围：保证结果在 1 \le n \le 2^{31}-1 \1≤n≤2
 * 31
 * ?1
 */
public class ccc002 {
    public static Map<String, String> xx = new HashMap<>();

    static {
        xx.put("0", "0");
        xx.put("1", "1");
        xx.put("2", "2");
        xx.put("3", "3");
        xx.put("4", "4");
        xx.put("5", "5");
        xx.put("6", "6");
        xx.put("7", "7");
        xx.put("8", "8");
        xx.put("9", "9");
        xx.put("A", "10");
        xx.put("B", "11");
        xx.put("C", "12");
        xx.put("D", "13");
        xx.put("E", "14");
        xx.put("F", "15");
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String demo_num = x.nextLine();
        String res = "";
        for (int i = 2; i < demo_num.length(); i++) {
            String demo_str = String.valueOf(demo_num.charAt(i));
            res += trans(demo_str, xx);
        }
        trans3(res);
        System.out.println(res);
    }

    public static String trans(String demo, Map<String, String> x) {
        // Set<Map.Entry<String, String>> show = x.entrySet();
        for (String s : x.keySet()) {
            if (x.get(s).equals(demo) || s.equals(demo)) {
                return trans2(x.get(s));
            }
        }
        return "";
    }

    public static String trans2(String num) {
        // int total_lenth = num.length();
        String result = "";
        String result2 = "";

        Integer input = Integer.valueOf(num);
        while (input >= 1) {
            // if (Integer.valueOf(num) % 2 == 0) {
            //     result += input % 2 == 0 ? "1" : "0";
            // } else {
            //     result += input % 2 == 0 ? "0" : "1";
            // }
            result2 = input % 2 == 0 ? "0" : "1";
            result = result2 + result;
            input /= 2;
        }
        while (result.length() < 4) {
            result = "0" + result;
        }
        return result;
        // System.out.println(result);
    }

    public static int trans3(String result) {
        int result2 = 0;
        for (int i = 0, j = result.length() - 1; i < result.length(); i++, j--) {
            String demo = String.valueOf(result.charAt(j));
            // int pow_int = demo.equals("0") ? 0 : i;
            // double pow = Math.pow(2, pow_int);
            // 这里一开始就没搞懂二进制的运算原理
            double pow = demo.equals("0") ? 0 : Math.pow(2, i);
            result2 += pow;
        }
        System.out.println(result2);
        return result2;
    }
}
// 0-1-2-3-4-5-6-7
// 0-1-0-1-0-1-0-1
// 1-2-1-8-1-32-1-128，这个是错的
// 0-2-0-8-0-32-0-128，这个是对的
