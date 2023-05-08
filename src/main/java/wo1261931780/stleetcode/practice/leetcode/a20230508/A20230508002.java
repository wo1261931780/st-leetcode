package wo1261931780.stleetcode.practice.leetcode.a20230508;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode
 * Package:wo1261931780.stleetcode.practice.leetcode.a20230508
 *
 * @author liujiajun_junw
 * @Date 2023-05-12-26  星期一
 * @description
 */
public class A20230508002 {
    /**
     * 描述
     * 请实现一个计票统计系统。你会收到很多投票，其中有合法的也有不合法的，请统计每个候选人得票的数量以及不合法的票数。
     * （注：不合法的投票指的是投票的名字不存在n个候选人的名字中！！）
     * <p>
     * 数据范围：每组输入中候选人数量满足
     * 1
     * ≤
     * �
     * ≤
     * 100
     * <p>
     * 1≤n≤100  ，总票数量满足
     * 1
     * ≤
     * �
     * ≤
     * 100
     * <p>
     * 1≤n≤100
     * 输入描述：
     * 第一行输入候选人的人数n，第二行输入n个候选人的名字（均为大写字母的字符串），第三行输入投票人的人数，第四行输入投票。
     * <p>
     * 输出描述：
     * 按照输入的顺序，每行输出候选人的名字和得票数量（以" : "隔开，注：英文冒号左右两边都有一个空格！），最后一行输出不合法的票数，格式为"Invalid : "+不合法的票数。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String none1 = scanner.nextLine();
        String[] people = scanner.nextLine().split(" ");
        String none2 = scanner.nextLine();
        String[] vote = scanner.nextLine().split(" ");
        HashMap<String, Integer> peopleMap = new LinkedHashMap<>();
        for (String s : people) {
            peopleMap.put(s, 0);
        }
        peopleMap.put("Invalid", 0);
        for (String s : vote) {
            if (peopleMap.containsKey(s)) {
                peopleMap.put(s, peopleMap.get(s) + 1);
            } else {
                peopleMap.put("Invalid", peopleMap.get("Invalid") + 1);
            }
        }
        peopleMap.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
        sampleCode();
    }

    public static void sampleCode() {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            //初始化
            int numOfCandidates = in.nextInt();
            in.nextLine();//指针移到下一行开头
            String[] nameOfCandidates = in.nextLine().split(" ");
            int numOfVotes = in.nextInt();
            in.nextLine();//指针移到下一行开头
            String[] voteFor = in.nextLine().split(" ");
            Map<String, Integer> dict = new HashMap<>();
            int invalid = 0;
            for (int i = 0; i < numOfCandidates; i++) {
                dict.put(nameOfCandidates[i], 0);
            }
            //计数
            for (int j = 0; j < numOfVotes; j++) {
                if (!dict.containsKey(voteFor[j])) {
                    invalid++;
                } else {
                    Integer pre = dict.get(voteFor[j]);
                    dict.put(voteFor[j], pre + 1);
                }
            }
            //输出结果
            StringBuilder res = new StringBuilder();
            for (String s : nameOfCandidates) {
                res.append(s);
                res.append(" : ");
                res.append(dict.get(s));
                res.append("\n");
            }
            res.append("Invalid : ");
            res.append(invalid);
            System.out.println(res);
        }
    }
}
