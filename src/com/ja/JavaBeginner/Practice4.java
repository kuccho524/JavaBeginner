package com.ja.JavaBeginner;

public class Practice4 {
	public static void main(String[] args) {
		
		// int型を持つ変数isHungryに1を代入する
		int isHungry = 1;
		
		// String型を持つ変数foodに食べ物を代入
		String food = "パン";
		
		// 「こんにちは」と出力する
		System.out.println("こんにちは");
		
		/*
		 * 変数isHungryが0であれば「お腹いっぱい」、それ以外は「腹ペコ」
		 * 変数isHungryが空腹の場合、「〇〇をいただきますと表示」
		 */
		// 
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}
		
		System.out.println("ごちそうさまでした");
	}
}
