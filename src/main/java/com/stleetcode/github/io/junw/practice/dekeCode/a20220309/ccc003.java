package com.stleetcode.github.io.junw.practice.dekeCode.a20220309;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa005_20220309
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-13-07  ÐÇÆÚÈý
 * @author junw
 */

@Slf4j
public class ccc003 {
	public static void main(String[] args) {
		String x = "deaslasdhakjdhaksjd";
		String xx;
		Set<String> x1 = new LinkedHashSet<>();
		for (int i = 0; i < x.length(); i++) {
			x1.add(x.charAt(i) + "");
		}
		StringBuilder xxBuilder = new StringBuilder();
		for (int i = 0; i < x1.size(); i++) {
			xxBuilder.append(x1.toArray()[i]);
		}
		xx = xxBuilder.toString();
		log.info(xx);
		log.info(String.valueOf(xx.length()));
	}
}
