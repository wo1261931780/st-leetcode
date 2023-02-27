package wo1261931780.stleetcode.practice.leetcode.a20230227;

import java.util.Scanner;

public class aaa065查找 {
	public static void main(String[] args) {
		int[] zz = {32456, 23, 1, 4, 56, 4, 178, 13, 54, 15, 2, 1};
		Scanner b11 = new Scanner(System.in);
		System.out.println("输入数据：");
		int z1 = b11.nextInt();
		System.out.println("数组长度为：" + zz.length);
		System.out.println("开始查找数据------------");
		int z = 0;
		int z0 = -1;
		for (System.out.println("主程序查找"); z < zz.length; z++) {
			if (z1 == zz[z]) {
				z0 = z;
				break;
			}
		}
		System.out.println("主程序结果为：" + z0);
		// 这里用了两种方法去查询
		// 一种是使用main方法内的遍历，一种是封装成方法直接调用
		int qq = db(zz, z1);
		System.out.println("方法得到的索引是第" + qq + "位");
        /*
        boolean xx = db(zz,z1);
        if (xx == false) {
            System.out.println("错误-1");
        } else {
        }
        */
	}
    /*
    public static boolean db(int[] zz,int z1) {
        //这里01和1的含义相同，进制不同。
        //相同数据，优先查找靠前的。
        System.out.println("开始查找数据------------");
        for (int x = 0; x < zz.length; x++) {
            if (z1 == zz[x]) {
                System.out.println("索引是第" + x + "位");
                return true;
                //break;
                //这里如果不暂停，应该会多次对比，因为数组中数据可能重复.
            } else {
            }
        }这一段都太啰嗦了
        return false;
    */

	public static int db(int[] zz, int z1) {
		int x = 0;
		for (System.out.println("方法开始查找数据------------"); x < zz.length; x++) {
			if (z1 == zz[x]) {
				return x;
				// break;
				// 这里数组的长度是12，加上0位数字，如果11位还无法判断，可以认定不存在
			} else if (x == 11) {
				System.out.println("数字不存在数组中");
				// 返回值-1表示不存在数字
				return x = -1;
			} else {
				// System.out.println("继续遍历");
				// x = -1;
				// break;
			}
		}
		return x;
	}
}
