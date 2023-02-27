package wo1261931780.stleetcode.practice.leetcode.a20230227;

import java.util.Scanner;

/**
 * 导包：
 * 1:手动导包  import java.util.Scanner;
 * <p>
 * 手动输入语句
 * <p>
 * 2:快捷键导包 Alt+Enter
 * <p>
 * 在scanner上面按快捷键
 * <p>
 * 3:自动导包
 * <p>
 * 不导包，直接输入scanner，会自动导包+创建对象
 */
public class aaa059减肥计划 {
	public static void main(String[] args) {
		Scanner b11 = new Scanner(System.in);
		System.out.println("请输入时间：");
		int xx = b11.nextInt();
		if (xx == 1) {
			System.out.println("周一：跑步");
		} else if (xx == 2) {
			System.out.println("周二：游泳");
		} else if (xx == 3) {
			System.out.println("周三：走路");
		} else if (xx == 4) {
			System.out.println("周四：单车");
		} else if (xx == 5) {
			System.out.println("周五：拳击");
		} else if (xx == 6) {
			System.out.println("周六：爬山");
		} else if (xx == 7) {
			System.out.println("周日：吃饭");
		} else {
			System.out.println("时间错误，请重新输入");
		}
        /*switch语句实现
        switch (xx) {
            case 1:
                System.out.println("周一：跑步");
                break;
            case 2:
                System.out.println("周二：游泳");
                break;
            case 3:
                System.out.println("周三：走路");
                break;
            case 4:
                System.out.println("周四：单车");
                break;
            case 5:
                System.out.println("周五：拳击");
                break;
            case 6:
                System.out.println("周六：爬山");
                break;
            case 7:
                System.out.println("周日：吃饭");
                break;
            default:
                System.out.println("时间错误,请重新输入");
                break;
        }*/
	}

}
