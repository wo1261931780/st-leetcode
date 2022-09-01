package com.leetcode.eee118自己出题1;

public class demo_student_obj {
	private int number;
	private String name;
	private int age;
	private String address;

	public demo_student_obj(int number, String name, int age, String address) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.address = address;
	}

// --注释掉检查 START (2022-09-01 12:35):
//    public demo_student_obj() {
//    }
// --注释掉检查 START (2022-09-01 12:35):
//// --注释掉检查 STOP (2022-09-01 12:35)
//
//    public int getNumber() {
//        return number;
//    }
// --注释掉检查 STOP (2022-09-01 12:35)

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
