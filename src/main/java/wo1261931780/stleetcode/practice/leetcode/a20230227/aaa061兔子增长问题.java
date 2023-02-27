package wo1261931780.stleetcode.practice.leetcode.a20230227;
// 兔子增长问题，
// 核心在于，第三个月的兔子数量=第一个月+第二个月
// 整体的数量变化为：1，1，2，3，5......

public class aaa061兔子增长问题 {
	// public static void main(String[] args) {
	//     //第一次代码-------------------
	//     /*int x1=1;
	//     int x2=1;
	//     int xx = 3;
	//     int x3 = 0;
	//     for(System.out.println("开始计算:");xx<21;xx++){
	//         x3=x1+x2;
	//         x1=x2;
	//         x2=x3;
	//         System.out.println("第"+xx+"个月的时候，数量是："+x3);
	//     }*/
	//
	//     int[] xx = new int[20];
	//     xx[0] = 1;
	//     xx[1] = 1;
	//     //xx[2] = xx[0] + xx[1];
	//     int x = 2;
	//     for (System.out.println("开始计算:"); x < xx.length; x++) {
	//         xx[x] = xx[x - 2] + xx[x - 1];
	//         //xx[x - 2] = xx[x - 1];
	//         //xx[x - 1] = xx[x];
	//         System.out.println("第" + x + "个月的时候，数量是：" + xx[x]);
	//     }
	// }
	public static void main(String[] args) {
		System.out.println("------------------------------");

		int x = 1;
		int[] x1 = new int[20];
		for (int i = 0; i < x1.length; i++) {
			x1[i] = x;
			if (i > 0) {
				x = x1[i] + x1[i - 1];
			}
			System.out.println("第" + i + "个月");
			System.out.println("此时的兔子数量：" + x1[i]);
		}
		System.out.println("------------------------------");
		System.out.println(x1[19]);
	}
}
