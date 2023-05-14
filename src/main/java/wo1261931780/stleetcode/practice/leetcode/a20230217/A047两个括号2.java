package wo1261931780.stleetcode.practice.leetcode.a20230217;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by Intellij IDEA.
 * Project:st-leetcode.github.io
 * Package:com.stleetcode.github.io.junw.practice.leetcode.a20230217
 *
 * @author liujiajun_junw
 * @Date 2023-02-20-45  星期五
 * @description
 */
public class A047两个括号2 {
	private static final Map<Character, Character> map = new HashMap<Character, Character>() {{
		put('{', '}');
		put('[', ']');
		put('(', ')');
		put('?', '?');
	}};
	
	public boolean isValid(String s) {
		if (s.length() > 0 && !map.containsKey(s.charAt(0))) {
			return false;
		}
		LinkedList<Character> stack = new LinkedList<Character>() {{
			add('?');
		}};
		for (Character c : s.toCharArray()) {
			if (map.containsKey(c)) {
				stack.addLast(c);
			} else if (!map.get(stack.removeLast()).equals(c)) {
				return false;
			}
		}
		return stack.size() == 1;
	}
}
