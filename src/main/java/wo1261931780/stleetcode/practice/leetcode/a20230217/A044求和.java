package wo1261931780.stleetcode.practice.leetcode.a20230217;

import lombok.extern.slf4j.Slf4j;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/**
 * @author junw
 */

@Slf4j
public class A044求和 {
	public static void main(String[] args) {
		// Random random = new Random();
		// 使用伪随机数生成器（PRNGs）是安全敏感的。例如，它在过去导致了以下漏洞。
		// CVE-2013-6386
		// CVE-2006-3419
		// CVE-2008-4102
		// 当软件在需要不可预测的上下文中生成可预测的值时，攻击者有可能猜到下一个将生成的值，并利用这一猜测来冒充另一个用户或访问敏感信息。
		// 由于java.util.Random类依赖于伪随机数生成器，这个类和相关的java.lang.Math.random()方法不应该被用于安全关键型应用或保护敏感数据。在这种情况下，应该使用java.security.SecureRandom类，它依赖于一个密码学上强大的随机数发生器（RNG）。
		SecureRandom random = new SecureRandom();
		// 数组中，不包含7的所有元素求和
		// int[] x = {1, 7, 9, 10};
		int[] x = new int[10];
		sub(x, random);
		int x1 = 0;
		for (int i : x) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7 || i / 100 == 7) {
				log.info("避免if空体");
			} else {
				log.info(String.valueOf(i));
				x1 += i;
			}
		}
		log.info(String.valueOf(x1));
	}
	
	public static void sub(int[] x, Random x1) {
		
		for (int i = 0; i < x.length; i++) {
			int x2 = x1.nextInt(1000);
			x[i] = x2;
		}
		log.info(Arrays.toString(x));
	}
}
