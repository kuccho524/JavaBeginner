package com.ja.JavaBeginner;

public class Fortune {
	public static void main(String[] args) {
		
		// 名前を取得する
		System.out.println("名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		
		// 乱数を出し、1を足す
		int num = new java.util.Random().nextInt(6);
		num++;
		
		// 運勢を占う
		System.out.print("あなたの運勢は");
		
		switch(num) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("小吉");
			break;
		case 4:
			System.out.println("吉");
			break;
		case 5:
			System.out.println("凶");
			break;
		case 6:
			System.out.println("大凶");
			break;
		default:
			System.out.println("故障中");
		}
	}
}
