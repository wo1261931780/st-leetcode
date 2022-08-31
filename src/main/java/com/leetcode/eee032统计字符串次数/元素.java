package com.leetcode.eee032统计字符串次数;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * 二、编程题
 * 输入任意一种物质，要求输出其每种元素的数量。
 * 比如
 * 输入 CaCO3，其组成分别为 Ca：1，C：1，O：3，输出 Ca1C1O3
 * 输入 Fe2(SO4)3，其组成分别为 Fe：2，S：3，O：12，输出 Fe2S3O12
 * （注意：元素名称首字母大写，剩余字母都小写；括号括起来表示括号中的结构作
 * 为整体出现多少次）
 * ------------------------
 * ca是一个元素，c，o，fe，s，一共五个元素
 * 括号要乘法
 */

public class 元素 {
    public static void main(String[] args) {

        // 首先对元素进行遍历，判断有多少种元素
        // 然后判断元素个数，
        // 最后输出结果
        TreeMap<String, Integer> element_map = new TreeMap<>();
        // 储存格式为hashmap，
        // 元素作为键，元素个数作为值
        // ------------
        // TreeMap的好处在于，对键进行了排序
        // 先添加元素
        element_map.put("Ca", 0);//67/97
        element_map.put("C", 0);//67
        element_map.put("O", 0);//79
        element_map.put("Fe", 0);//70/101
        element_map.put("S", 0);//83

        Scanner input_element = new Scanner(System.in);
        System.out.println("请输入元素：");
        // 将结果设置为字符串
        String ch_element = input_element.nextLine();

        // 遍历
        for (int i = 0; i < ch_element.length(); i++) {
            char index_element = ch_element.charAt(i);
            char index_element2 = ch_element.charAt(i++);
            if (index_element == 83 || index_element == 79 || index_element == 70) {
                Integer map_value = element_map.get(index_element);
                if (map_value == 0) {
                    element_map.put(String.valueOf(index_element), 1);
                } else {
                    map_value++;
                    element_map.put(String.valueOf(index_element), map_value);
                }
            } else if (index_element == 67) {
                if (index_element2 == 97) {
                    Integer map_value = element_map.get("Ca");
                    if (map_value == 0) {
                        element_map.put("Ca", 1);
                    } else {
                        map_value++;
                        element_map.put("Ca", map_value);
                    }
                } else {
                    Integer map_value = element_map.get(index_element);
                    if (map_value == 0) {
                        element_map.put(String.valueOf(index_element), 1);
                    } else {
                        map_value++;
                        element_map.put(String.valueOf(index_element), map_value);
                    }
                }
            }
        }
        System.out.println(element_map);
    }
}
