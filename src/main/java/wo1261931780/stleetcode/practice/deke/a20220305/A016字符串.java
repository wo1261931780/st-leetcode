package wo1261931780.stleetcode.practice.deke.a20220305;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc88tcp
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-58  ÐÇÆÚÒ»
 *
 * @author junw
 */
@Slf4j
public class A016字符串 {
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
		log.info(x2.toString());
		StringBuilder textBuilder = new StringBuilder();
		for (int i = 0; i < x2.size(); i++) {
			textBuilder.append(x2.toArray()[i]);
		}
		text = textBuilder.toString();
		log.info(text);
		
		// String removeDul (String text){
		// }
	}
}
