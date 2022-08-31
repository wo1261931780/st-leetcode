package com.leetcode.eee118自己出题1;

import java.util.ArrayList;
import java.util.Scanner;

public class demo_student_manage_system {
	private static final String stCode = "请输入学号：";

	public static void main(String[] args) {
		ArrayList<leetcode.eee118自己出题1.demo_student_obj> xx = new ArrayList<>();
		int r = show(0);
		while (r != 5) {
			// int s = r;
			if (r == 1) {
				add_student(xx);
			} else if (r == 2) {
				remove_student(xx);
			} else if (r == 3) {
				change_student(xx);
			} else if (r == 4) {
				show_student(xx);
			} else if (r == 5) {
				break;
			}
			r = show(0);
		}
		// do {
		//     if (r == 1) {
		//         add_student(xx);
		//     } else if (r == 2) {
		//         remove_student(xx);
		//     } else if (r == 3) {
		//         change_student(xx);
		//     } else if (r == 4) {
		//         show_student(xx);
		//     } else if (r == 5) {
		//         break;
		//     }
		// } while (show(0) != 5);
		System.out.println("程序结束");
		// -------------------------------------------------


	}

	public static int show(int s) {
		Scanner x = new Scanner(System.in);
		System.out.println("-----------学生管理系统-----------");
		System.out.println("1.添加学生");
		System.out.println("2.删除学生");
		System.out.println("3.修改学生");
		System.out.println("4.查看所有学生");
		System.out.println("5.退出");
		System.out.println("请输入你的选择：");
		int x1 = x.nextInt();
		return x1;
	}

	public static void add_student(ArrayList<leetcode.eee118自己出题1.demo_student_obj> xx) {
		Scanner x1 = new Scanner(System.in);
		Scanner xx1 = new Scanner(System.in);
		System.out.println(stCode);
		int num = x1.nextInt();
		// String num=x1.nextLine();
		System.out.println("请输入姓名：");
		String name = xx1.nextLine();
		System.out.println("请输入年龄：");
		int age = x1.nextInt();
		System.out.println("请输入地址：");
		String addr = xx1.nextLine();
		leetcode.eee118自己出题1.demo_student_obj x = new leetcode.eee118自己出题1.demo_student_obj(num, name, age, addr);
		xx.add(x);
		System.out.println("添加完成");
	}

	public static void remove_student(ArrayList<leetcode.eee118自己出题1.demo_student_obj> xx) {
		Scanner x = new Scanner(System.in);
		System.out.println(stCode);
		int x1 = x.nextInt();
		for (leetcode.eee118自己出题1.demo_student_obj x2 : xx) {
			if (x1 == x2.getNumber()) {
				xx.remove(x2);
				System.out.println("删除成功");
			}
		}
		System.out.println("删除结束");
	}

	public static void change_student(ArrayList<leetcode.eee118自己出题1.demo_student_obj> xx) {
		Scanner x = new Scanner(System.in);
		Scanner xx1 = new Scanner(System.in);
		System.out.println(stCode);
		int x1 = x.nextInt();
		for (leetcode.eee118自己出题1.demo_student_obj x2 : xx) {
			if (x1 == x2.getNumber()) {
				System.out.println("请输入姓名：");
				String x3 = xx1.nextLine();
				x2.setName(x3);
				System.out.println("请输入年龄：");
				int x4 = x.nextInt();
				x2.setAge(x4);
				System.out.println("请输入住址：");
				String x5 = xx1.nextLine();
				x2.setAddress(x5);
				System.out.println("设置成功");
			}
		}
		System.out.println("修改结束");
	}

	public static void show_student(ArrayList<leetcode.eee118自己出题1.demo_student_obj> xx) {
		System.out.println("学号" + "\t\t" + "姓名" + "\t\t" + "年龄" + "\t\t" + "住址");
		for (leetcode.eee118自己出题1.demo_student_obj x : xx) {
			System.out.println(x.getNumber() + "\t\t" + x.getName() + "\t\t" + x.getAge() + "\t\t" + x.getAddress());
		}
		System.out.println("遍历结束");
	}
}
