package wo1261931780.stleetcode.practice.leetcode.a20230227;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class aaa058双色球案例 {
	public static void main(String[] args) {
		int[] x = new int[7];
		int[] x1 = new int[7];
		// show(x);
		// Arrays.toString(type(x));
		int[] ss = type(x);
		// show2(x1);
		bj(show2(x1), ss);
	}
	
	public static int[] type(int[] xx) {
		Scanner x = new Scanner(System.in);
		for (int i = 0; i < xx.length - 1; i++) {
			// 打破循环的前提，是有一个状态控制命令
			while (true) {
				System.out.println("please enter in" + i + "位的数字");
				xx[i] = x.nextInt();
				boolean stage = true;
				for (int i1 = 0; i1 < i; i1++) {
					if (xx[i1] == xx[i]) {
						stage = false;
						break;
					}
				}
				// 这里判断是否解除死循环，不存在相同数据的时候解除
				if (stage) {
					break;
				}
			}
		}
		System.out.println("请输入蓝色球号码");
		xx[xx.length - 1] = x.nextInt();
		System.out.println(Arrays.toString(xx));
		System.out.println("finish");
		return xx;
	}
	
	public static void bj(int[] x1, int[] x2) {
		int red = 0;
		int blue = 0;
		for (int i = 0; i < x1.length; i++) {
			// if (x1[i] != x2[i]) {
			//     System.out.println("不相等");
			//     return;
			// }
			for (int i1 = 0; i1 < x2.length; i1++) {
				if (x1[i] != x2[i1]) {
					// return;
				} else {
					if (i == x1.length - 1) {
						blue++;
					} else {
						red++;
					}
				}
			}
		}
		System.out.println("中奖情况：红色" + red + "蓝色" + blue);
	}
	
	// 课程写法：
	public static int[] show2(int[] xx) {
		Random x = new Random();
		for (int i = 0; i < xx.length - 1; i++) {
			while (true) {
				// 为了不重复的数字，需要多次循环
				// 在不知道循环次数的情况下，直接给出一个死循环即可
				int r1 = x.nextInt(33) + 1;
				boolean sin = true; // 信号位
				for (int i1 = 0; i1 < i; i1++) {
					// 这里注意写的是前面的index,是i1不是i
					if (r1 == xx[i1]) {
						sin = false;
						break;
					}
				}
				if (sin) {
					xx[i] = r1;
					break;
					// 完成赋值，直接结束随机数的循环
				}
				// 这里也是需要注意的，
				// 没有必要像下面这样多次判断
				
				// if (sin == false) {
				//     break;
				// } else {
				//     xx[i] = r1;
				// }
			}
		}
		int b1 = x.nextInt(16) + 1;
		xx[xx.length - 1] = b1;
		System.out.println(Arrays.toString(xx));
		return xx;
	}
	
	public static void show(int[] xx) {
		Random x = new Random();
		for (int i = 0; i < xx.length - 1; i++) {
			
			int r1 = x.nextInt(33) + 1;
			for (int ii = 0; ii < xx.length; ii++) {
				if (xx[ii] == r1) {
					r1 = x.nextInt(33) + 1;
					break;
				}
			}
			xx[i] = r1;
			// yn(xx, r1) ? xx[i] = r1 : r1 = x.nextInt(33) + 1;
		}
		int b1 = x.nextInt(16) + 1;
		xx[xx.length - 1] = b1;
		System.out.println(Arrays.toString(xx));
	}
}
