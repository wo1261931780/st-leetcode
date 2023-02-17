package com.stleetcode.github.io.junw.practice.eee118自己出题1;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author junw
 */

@Slf4j
public class demo_student_manage_system {
	private static final String ST_CODE = "请输入学号：";

	public static void main(String[] args) {
		ArrayList<demo_student_obj> xx = new ArrayList<>();
		int r = show(0);
		while (r != 5) {
			// int s = r;
			if (r == 1) {
				addStudent(xx);
			} else if (r == 2) {
				removeStudent(xx);
			} else if (r == 3) {
				changeStudent(xx);
			} else if (r == 4) {
				showStudent(xx);
			} else {
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
		log.info("程序结束");
		// -------------------------------------------------


	}

	public static int show(int ignoredS) {
		Scanner x = new Scanner(System.in);
		log.info("-----------学生管理系统-----------");
		log.info("1.添加学生");
		log.info("2.删除学生");
		log.info("3.修改学生");
		log.info("4.查看所有学生");
		log.info("5.退出");
		log.info("请输入你的选择：");
		return x.nextInt();
	}

	public static void addStudent(ArrayList<demo_student_obj> xx) {
		Scanner x1 = new Scanner(System.in);
		Scanner xx1 = new Scanner(System.in);
		System.out.println(ST_CODE);
		int num = x1.nextInt();
		// String num=x1.nextLine();
		log.info("请输入姓名：");
		String name = xx1.nextLine();
		log.info("请输入年龄：");
		int age = x1.nextInt();
		log.info("请输入地址：");
		String addr = xx1.nextLine();
		demo_student_obj x = new demo_student_obj(num, name, age, addr);
		xx.add(x);
		log.info("添加完成");
	}

	public static void removeStudent(ArrayList<demo_student_obj> xx) {
		Scanner x = new Scanner(System.in);
		System.out.println(ST_CODE);
		int x1 = x.nextInt();
		for (demo_student_obj x2 : xx) {
			if (x1 == x2.getNumber()) {
				xx.remove(x2);
				log.info("删除成功");
			}
		}
		log.info("删除结束");
	}

	public static void changeStudent(ArrayList<demo_student_obj> xx) {
		Scanner x = new Scanner(System.in);
		Scanner xx1 = new Scanner(System.in);
		System.out.println(ST_CODE);
		int x1 = x.nextInt();
		for (demo_student_obj x2 : xx) {
			if (x1 == x2.getNumber()) {
				log.info("请输入姓名：");
				String x3 = xx1.nextLine();
				x2.setName(x3);
				log.info("请输入年龄：");
				int x4 = x.nextInt();
				x2.setAge(x4);
				log.info("请输入住址：");
				String x5 = xx1.nextLine();
				x2.setAddress(x5);
				log.info("设置成功");
			}
		}
		log.info("修改结束");
	}

	public static void showStudent(ArrayList<demo_student_obj> xx) {
		log.info("学号" + "\t\t" + "姓名" + "\t\t" + "年龄" + "\t\t" + "住址");
		for (demo_student_obj x : xx) {
			System.out.println(x.getNumber() + "\t\t" + x.getName() + "\t\t" + x.getAge() + "\t\t" + x.getAddress());
		}
		log.info("遍历结束");
	}
}
