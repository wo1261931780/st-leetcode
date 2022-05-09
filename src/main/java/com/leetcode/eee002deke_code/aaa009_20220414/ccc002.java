package leetcode.eee002deke_code.aaa009_20220414;

import java.util.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220414
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-02  星期四
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 * <p>
 * 输入：
 * <p>
 * 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
 * <p>
 * 坐标之间以;分隔。
 * <p>
 * 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
 * <p>
 * 下面是一个简单的例子 如：
 * <p>
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 * <p>
 * 处理过程：
 * <p>
 * 起点（0,0）
 * <p>
 * +   A10   =  （-10,0）
 * <p>
 * +   S20   =  (-10,-20)
 * <p>
 * +   W10  =  (-10,-10)
 * <p>
 * +   D30  =  (20,-10)
 * <p>
 * +   x    =  无效
 * <p>
 * +   A1A   =  无效
 * <p>
 * +   B10A11   =  无效
 * <p>
 * +  一个空 不影响
 * <p>
 * +   A10  =  (10,-10)
 * <p>
 * 结果 （10， -10）
 * <p>
 * 数据范围：每组输入的字符串长度满足 1\le n \le 10000 \1≤n≤10000  ，坐标保证满足 -2^{31} \le x,y \le 2^{31}-1 \?2
 * 31
 * ≤x,y≤2
 * 31
 * ?1  ，且数字部分仅含正数
 */
public class ccc002 {
    public static Map<Integer, Integer> map = new HashMap<>();

    static {
        map.put(0, 0);
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String[] init_jh = x.nextLine().split(";");
        List<String> demo = new ArrayList<>();
        for (int i = init_jh.length - 1; i > 0; i--) {
            if (init_jh[i].length() == 3 || init_jh[i].length() == 2) {
                String substring = init_jh[i].substring(0, 1);
                int substring2 = 0;
                try {
                    substring2 = Integer.valueOf(init_jh[i].substring(1, init_jh[i].length()));
                    // 2022年4月15日13:32:11，这里做一下异常处理
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
                if (show(substring, substring2)) {
                    demo.add(init_jh[i]);
                }
            }
        }
        show2(demo);


    }

    // 首先将拿到的字符串，解析为一个数组，
    // 对数组遍历，删除长度不等于3的，首字符不属于wasd的，
    // 使用后面的字符除2，结果运行报错的
    // 然后对数组的元素处理，将其分割，对初始的map进行数据操作
    // 输出最终的map结果即可

    public static boolean show(String substring, int substring2) {
        boolean x = false;
        if (substring.equals("W") || substring.equals("A") || substring.equals("S") || substring.equals("D")) {
            x = true;
        }
        try {
            int i = substring2 % 2;
        } catch (Exception e) {
            x = false;
        }
        return x;
    }

    public static void show2(List<String> demo) {
        for (String s : demo) {
            String str = s.substring(0, 1);
            int str2 = Integer.parseInt(s.substring(1, s.length() - 1));
            switch (str) {
                case "W":
                    map.put(0, map.get(0) + str2);
                    break;
                case "A":
                    map.put(map.get(0) - str2, 0);
                    break;
                case "S":
                    map.put(0, map.get(0) - str2);
                    break;
                case "D":
                    map.put(map.get(0) + str2, 0);
                    break;
                default:
                    break;
            }
        }
        System.out.println(map);

    }

}
