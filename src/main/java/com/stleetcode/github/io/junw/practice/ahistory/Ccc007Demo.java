package com.stleetcode.github.io.junw.practice.ahistory;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-23-47  星期日
 * @author junw
 */
@Slf4j
public class Ccc007Demo {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        String x1=x.nextLine();
        String x2=x.nextLine();
        int j=0;
        String demo1=x1.toUpperCase();// Converts all of the characters in this String to upper case using the rules of the default locale. This method is equivalent to toUpperCase(Locale.getDefault()).
        // 将所有的char字符转化为大写的String类型
        String demo2=x2.toUpperCase();
        for(int i=0;i<demo1.length();i++){
            String x3=String.valueOf(demo1.charAt(i));
            if(x3.equals(demo2)){
                j++;
            }
        }
        log.info(String.valueOf(j));
    }
}
