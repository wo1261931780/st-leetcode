package wo1261931780.stleetcode.practice.deke.a20220509;

import lombok.extern.slf4j.Slf4j;

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
 *
 * @author junw
 */
@Slf4j
public class A034输出其每种元素的数量 {
	public static void main(String[] args) {
		
		// 首先对元素进行遍历，判断有多少种元素
		// 然后判断元素个数，
		// 最后输出结果
		TreeMap<String, Integer> elementMap = new TreeMap<>();
		// 储存格式为hashmap，
		// 元素作为键，元素个数作为值
		// ------------
		// TreeMap的好处在于，对键进行了排序
		// 先添加元素
		elementMap.put("Ca", 0);// 67/97
		elementMap.put("C", 0);// 67
		elementMap.put("O", 0);// 79
		elementMap.put("Fe", 0);// 70/101
		elementMap.put("S", 0);// 83
		
		Scanner inputElement = new Scanner(System.in);
		log.info("请输入元素：");
		// 将结果设置为字符串
		String chElement = inputElement.nextLine();
		
		// 遍历
		for (int i = 0; i < chElement.length(); i++) {
			char indexElement = chElement.charAt(i);
			char indexElement2 = chElement.charAt(i++);
			if (indexElement == 83 || indexElement == 79 || indexElement == 70) {
				Integer mapValue = elementMap.get(indexElement);
				if (mapValue == 0) {
					elementMap.put(String.valueOf(indexElement), 1);
				} else {
					mapValue++;
					elementMap.put(String.valueOf(indexElement), mapValue);
				}
			} else if (indexElement == 67) {
				if (indexElement2 == 97) {
					Integer mapValue = elementMap.get("Ca");
					if (mapValue == 0) {
						elementMap.put("Ca", 1);
					} else {
						mapValue++;
						elementMap.put("Ca", mapValue);
					}
				} else {
					Integer mapValue = elementMap.get(indexElement);
					if (mapValue == 0) {
						elementMap.put(String.valueOf(indexElement), 1);
					} else {
						mapValue++;
						elementMap.put(String.valueOf(indexElement), mapValue);
					}
				}
			}
		}
		log.info(String.valueOf(elementMap));
	}
}
