package wo1261931780.stleetcode.practice.leetcode.a20230312;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;

@Slf4j
public class a20230312001list比较器 {
	public static void main(String[] args) {
		int[] demo = new int[10];
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i : demo) {
			arrayList.add(i);
		}
		arrayList.sort(Comparator.comparingInt(o -> o));
		log.info(arrayList.toString());
	}
}
