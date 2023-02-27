package wo1261931780.stleetcode.practice.leetcode.a20230227;

public class aaa063数组元素求和 {
	// public static void main(String[] args) {
	//     int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
	//     int x = 0;
	//     int xx = 0;
	//     for (System.out.println("开始循环"); x < arr.length; x++) {
	//         if (arr[x] % 10 != 7 && arr[x] / 10 % 10 != 7 && arr[x] % 2 == 0) {
	//             xx += arr[x];
	//         }
	//         /*
	//         if(arr[x]%10==7||arr[x]/10%10==7){
	//             //x++;
	//         }else if(arr[x]%2==0){
	//             xx +=arr[x];
	//             //x++;
	//         }*/
	//     }
	//     System.out.println(xx + "循环结束");
	// }
	public static void main(String[] args) {
		System.out.println("----------------------");
		int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
		demo1(arr);
	}

	/**
	 * 个位，十位数字都不包含7，并且为偶数
	 *
	 * @param arr 数组
	 */
	public static void demo1(int[] arr) {
		for (int x = 0, i = 0; i < arr.length; i++) {
			//
			if (arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 && arr[i] % 2 == 0) {
				System.out.println("数组数字为：" + arr[i]);
				x += arr[i];
				System.out.println(x);
			}
		}
		// System.out.println("----------------------");
	}
}
