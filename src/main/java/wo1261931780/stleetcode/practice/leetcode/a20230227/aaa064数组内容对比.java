package wo1261931780.stleetcode.practice.leetcode.a20230227;

public class aaa064数组内容对比 {
	public static void main(String[] args) {
		// int[] x1 = {23, 1351, 8, 3, 2165, 43, 132, 1856, 4};
		// int[] x2 = {23, 2165, 8, 13541, 43, 3, 132, 1856, 4};
		// System.out.println(x1.length);
		// System.out.println(x2.length);
		// int xx=0;
		// 下面进行了两次循环，遍历的结果比较准确。
		// System.out.println("开始对比------");
		// for (int z1 = 0; z1 < x1.length; z1++) {
		//     System.out.println("循环2------");
		//     for (int z2 = 0; z2 < x2.length; z2++) {
		//         if (x1[z1] == x2[z2]) {
		//             System.out.println("出现数据相同,相同项为："+x2[z2]);
		//             xx++;
		//         } else {
		//         }
		//     }
		// }
		// System.out.println("相同数据个数："+xx);
		// System.out.println("循环结束--------------");

		boolean b11 = db();
		System.out.println(b11);
		System.out.println("分割线-------------------------");
		boolean b22 = db2();
		// 这里调换数字顺序，结果显示数组不同，是否顺序也是数组data的一种？
		System.out.println(b22);
	}

    /**
     * 对比数组
     * @return 结果
     */
	public static boolean db() {
		int[] x1 = {23, 1351, 8, 3, 2165, 43, 132, 1856, 4};
		int[] x2 = {23, 2165, 8, 13541, 43, 3, 132, 1856, 4};
		//        int z1 =0;
		//        int z2 =0;
		if (x1.length != x2.length) {
			System.out.println("不相同");
			return false;
		} else {
            /*如果上面没有进行返回，那么下面自然会进行。
            for (int z1 = 0; z1 < x1.length; z1++) {
                System.out.println("第二次循环");
                for (int z2 = 0; z2 < x2.length; z2++) {
                    if (x1[z1] != x2[z2]) {
                        return false;
                    }
                }
            }*/
		}// 如果只循环一次，那么相同的表格，不同的数据是看不出来的。
		for (int z1 = 0; z1 < x1.length; z1++) {
			System.out.println("第二次循环");
			for (int z2 = 0; z2 < x2.length; z2++) {
				if (x1[z1] != x2[z2]) {
					return false;
				}
			}
		}
		// 上面的false没有返回，下面的自然是return，但是要记得加。
		return true;
	}

	/**
	 * 下面全部都是demo，测试调换顺序的影响。
	 * @return 结果
	 */
	public static boolean db2() {
		int[] x1 = {23, 16, 4};
		int[] x2 = {16, 23, 4};
		if (x1.length != x2.length) {
			System.out.println("不相同");
			return false;
		} else {
		}// 如果只循环一次，那么相同的表格，不同的数据是看不出来的。
		for (int z1 = 0; z1 < x1.length; z1++) {
			System.out.println("第二次循环");
			if (x1[z1] != x2[z1]) {
				return false;
			}
		}
		// 上面的false没有返回，下面的自然是return，但是要记得加。
		return true;
	}
}
