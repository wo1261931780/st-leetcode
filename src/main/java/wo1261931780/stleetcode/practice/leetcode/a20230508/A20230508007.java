package wo1261931780.stleetcode.practice.leetcode.a20230508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230508
 *
 * @author liujiajun_junw
 * @Date 2023-05-15-33  星期一
 * @description
 */
public class A20230508007 {
    /**
     * 描述
     * 输入一个只包含小写英文字母和数字的字符串，按照不同字符统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASCII码由小到大排序输出。
     * 数据范围：字符串长度满足
     * 1
     * ≤
     * �
     * �
     * �
     * (
     * �
     * �
     * �
     * )
     * ≤
     * 1000
     * <p>
     * 1≤len(str)≤1000
     * <p>
     * 输入描述：
     * 一个只包含小写英文字母和数字的字符串。
     * <p>
     * 输出描述：
     * 一个字符串，为不同字母出现次数的降序表示。若出现次数相同，则按ASCII码的升序输出。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        Map<Character, Integer> linkedHashMap = new TreeMap<>(
                // Comparator.comparingDouble(Character::charValue)
        );

        for (int i = 0; i < nextLine.length(); i++) {
            char c = nextLine.charAt(i);
            if (!(c >= 'A' && c <= 'Z')) {
                // if (linkedHashMap.get(c) == null) {
                //     linkedHashMap.put(c, 1);
                // } else {
                //     linkedHashMap.put(c, linkedHashMap.get(c) + 1);
                // }
                linkedHashMap.merge(c, 1, Integer::sum);
            }
        }
//        linkedHashMap.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o2 - o1)).toList().forEach((k) -> System.out.print(k.getKey()));
        linkedHashMap
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue((o1, o2) -> o2 - o1))
                .forEach((k) -> System.out.print(k.getKey()));
    }

    public static void sampleCode() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            while ((str = br.readLine()) != null) {
                System.out.println(count(str));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StringBuilder count(String str) {
        char[] strArray = str.toCharArray();
        int[] chArray = new int[129];
        //字符对应ascll码值下标元素自增来统计数量
        for (char i : strArray)
            chArray[i]++;
        int max = 0;
        //找出字符数量最多的ascll码值
        for (int i = 0; i < chArray.length; i++)
            if (max < chArray[i])
                max = chArray[i];
        StringBuilder sb = new StringBuilder();
        //按数量从大到小添加到可变字符序列sb
        while (max != 0) {
            for (int i = 0; i < chArray.length; i++)
                if (chArray[i] == max)
                    sb.append((char) i);
            max--;
        }
        return sb;
    }


}
