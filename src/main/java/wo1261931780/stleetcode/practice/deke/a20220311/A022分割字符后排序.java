package wo1261931780.stleetcode.practice.deke.a20220311;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author junw
 */
@Slf4j
public class A022分割字符后排序 {
	public static void main(String[] args) {
		String x = "12 68 798 78 46 234 968 798 87";
		String[] demo = x.split(" ");
		ArrayList<Integer> x1 = new ArrayList<>();
		for (String s : demo) {
			x1.add(Integer.parseInt(s));
		}
		x = "";
		show(x1);
		StringBuilder xBuilder = new StringBuilder(x);
		for (int i = 0; i < x1.size(); i++) {
			xBuilder.append(i == x1.size() - 1 ? String.valueOf(x1.get(i)) : x1.get(i) + " ");
		}
		x = xBuilder.toString();
		log.info(x);
	}
	
	public static void show(List<Integer> x) {
		int mid;
		for (int i = 0; i < x.size() - 1; i++) {
			for (int j = i; j < x.size() - i - 1; j++) {
				if (x.get(j) > x.get(j + 1)) {
					mid = x.get(j);
					x.set(j, x.get(j + 1));
					x.set(j + 1, mid);
				}
			}
		}
	}
}
