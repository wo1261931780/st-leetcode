package wo1261931780.stleetcode.practice.leetcode.a20230227;

public class aaa062公鸡母鸡小鸡数量问题 {
    public static void main(String[] args) {
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100 - x - y;
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println("公鸡" + x + ",母鸡" + y + ",小鸡" + z + "");
                }
            }
        }
    }
}
