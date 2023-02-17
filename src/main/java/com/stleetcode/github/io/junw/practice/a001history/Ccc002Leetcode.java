package com.stleetcode.github.io.junw.practice.a001history;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

// 求int型正整数在内存中存储时1的个数

/**
 * @author junw
 */
@Slf4j
public class Ccc002Leetcode {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int x1 = x.nextInt();
        // StringBuilder x2 = new StringBuilder();
        int demo = 0;
        while (true) {
            // x2.append(x1 % 2);
            // log.info(x1 %= 2);
            // log.info("x1:" + x1);
            // log.info("8%2" + 8 % 2);

            if ((x1 / 2) == 1) {
                demo++;
                log.info(String.valueOf(demo));
                break;
            } else if ((x1 % 2) == 0) {
                x1 /= 2;
            } else if ((x1 % 2) == 1) {
                demo++;
                x1 /= 2;
            } else {
                demo++;
                x1 /= 2;
                log.info("x1:" + x1);
            }

        }
    }
}
