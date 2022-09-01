package com.leetcode.eee002deke_code.aaa004_20220305;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc88tcp
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-58  ÐÇÆÚÒ»
 */
public class ccc001interview {
	public static void main(String[] args) {
		show();

	}

	public static void show() {
		String text = "GHEXADDBSOIJEHDNABLFJSQZXXAA";
		Set<String> x2 = new LinkedHashSet<>();
		// StringBuilder xx = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			// int x1 = text.charAt(i) - '0';
			// xx.append(x1);
			char demo = text.charAt(i);
			x2.add(String.valueOf(demo));
		}
		System.out.println(x2);
		StringBuilder textBuilder = new StringBuilder();
		for (int i = 0; i < x2.size(); i++) {
			textBuilder.append(x2.toArray()[i]);
		}
		text = textBuilder.toString();
		System.out.println(text);

		// String removeDul (String text){
		// }
	}
}
