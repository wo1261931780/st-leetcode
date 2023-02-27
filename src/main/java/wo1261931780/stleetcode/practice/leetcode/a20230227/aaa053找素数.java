package wo1261931780.stleetcode.practice.leetcode.a20230227;

/**
 * 需求：找出101-200之间的素数输出：
 * <p>
 * 素数是什么：如果除了1和它本身以外，不能被其他正整数整除，就叫素数。
 */
public class aaa053找素数 {
	public static void main(String[] args) {
		show();
		System.out.println("end");
	}

	public static void show() {
		// int x=100;
		for (int i = 101, x = 0; i < 200; i += 2) {
			// if (i % 3 == 0 || i % 7 == 0 || i % 5 == 0) {
			// } else {
			//     System.out.println(i);
			//     // x++;
			//     System.out.println(++x);
			// }
			// 上面的判断是否是357的倍数，同时已经排除了所有偶数数据，结果为25个
			// 信号位，用来识别状态是否发生改变

			boolean a = true;
			for (int j = 3; j < i / 2; j++) {
				if (i % j == 0) {
					// 如果可以整除，说明不是素数，所以不进行展示
					a = false;
					break;
				}
			}
			if (a == true) {
				System.out.println(i);
				System.out.println(++x);
			}
		}
	}
}
