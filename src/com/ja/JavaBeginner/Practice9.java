package com.ja.JavaBeginner;

public class Practice9 {
	public static void main(String[] args) {
		introduceOneself();
	}
	
	public static void introduceOneself() {
		String name = "Ryo";
		int age = 30;
		double height = 166.0;
		char zodiac = '未';
		
		System.out.println("私は" + name + "です。" + age + "歳、" + "身長" + height + "cmで、干支は" + zodiac + "年です。");
	}
}
