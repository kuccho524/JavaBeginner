package com.ja.JavaBeginner;

public class Practice11 {
	public static void main(String[] args) {
		
		// 引数を入力し、各メソッドを呼び出す
		double triangleArea = calcTriangleArea(5.0, 12.0);
		double circleArea = calcCircleArea(5.5);
		
		// 面積を出力する
		System.out.println("三角形の面積は、" + triangleArea + "平方cmです。");
		System.out.println("円の面積は、" + circleArea + "平方cmです。");
	}
	
	// 三角形の面積を求めるメソッド
	public static double calcTriangleArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;
	}
	
	// 円の面積を求めるメソッド
	public static double calcCircleArea(double radius) {
		final double PI = 3.14;
		double area = radius * radius * PI;
		return area;
	}
}
