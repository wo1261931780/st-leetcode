package com.stleetcode.github.io.junw.practice.ahistory;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * @author junw
 */
@Slf4j
public class Ccc003Practice {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int i = x.nextInt();
		if (i != 0) {
			show();
		}
	}

	public static void show() {
		int jw = 0;
		int cash = 100;

		for (int jwSum = cash / 5; jw <= jwSum; jw++) {
			int jm = 0;
			int cashNow = cash - 5 * jw;
			for (int jmNum = cashNow / 3; jm <= jmNum; jm++) {
				// for (int jc_num = 100 * 3; jc <= jc_num; jc++) {
				//     boolean x1 = jw * 5 + jm * 3 + jc / 3 == 100;
				//     boolean x2 = jw + jm + jc == 100;
				//     if (x1 && x2) {
				//         break;
				//     }
				// }
				int jc = 100 - jw - jm;
				if (jc % 3 == 0 && 5 * jw + 3 * jm + jc / 3 == 100) {
					log.info(jw + " " + jm + " " + jc);
				}
			}
		}
	}

	// 2022年2月9日21:59:06，正确思路：

	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				f(sc.nextInt());
			}
		}


		public static void f(int num) {
// 5x+3y+z/3=100;
// x+y+z=100;
// 简化得 7x+4y=100;
			int x, y, z;
			for (x = 0; x <= 14; x++) {
				if ((100 - 7 * x) % 4 == 0) {
					y = (100 - 7 * x) / 4;
					z = 100 - x - y;
					log.info(x + " ");
					log.info(y + " ");
					log.info(z + " ");
				}
			}
		}
	}


}
