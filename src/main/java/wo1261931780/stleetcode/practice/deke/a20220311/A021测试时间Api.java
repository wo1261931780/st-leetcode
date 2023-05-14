package wo1261931780.stleetcode.practice.deke.a20220311;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa007_20220311
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-13-30  ÐÇÆÚÎå
 *
 * @author junw
 */
@Slf4j
public class A021测试时间Api {
	public static void main(String[] args) {
		LocalDate x = LocalDate.now();
		log.info(String.valueOf(x));// 2022-03-11
		int demoYear = x.getYear();
		log.info(String.valueOf(demoYear));// 2022
		log.info(String.valueOf(x.getDayOfWeek().getValue()));
		log.info(String.valueOf(x.getDayOfWeek()));
		log.info(String.valueOf(x.getDayOfMonth()));
		log.info(String.valueOf(x.getDayOfYear()));
		
		// LocalDateTime x1=LocalDateTime.now();
		// LocalDate demo_time = x1.toLocalDate();
		LocalDate demoTime = LocalDateTime.now().toLocalDate();//
		log.info(String.valueOf(demoTime));
	}
}
