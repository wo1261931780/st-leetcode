package leetcode.eee002deke_code.aaa007_20220311;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa007_20220311
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-13-30  ÐÇÆÚÎå
 */
public class demo {
    public static void main(String[] args) {
        LocalDate x = LocalDate.now();
        System.out.println(x);// 2022-03-11
        int demo_year = x.getYear();
        System.out.println(demo_year);// 2022
        System.out.println(x.getDayOfWeek().getValue());
        System.out.println(x.getDayOfWeek());
        System.out.println(x.getDayOfMonth());
        System.out.println(x.getDayOfYear());



        // LocalDateTime x1=LocalDateTime.now();
        // LocalDate demo_time = x1.toLocalDate();
        LocalDate demo_time = LocalDateTime.now().toLocalDate();//
        System.out.println(demo_time);


    }
}
