package com.ja.JavaBeginner;

/*
 * 「数当てゲーム」
 */

public class Practice6 {
	public static void main(String[] args) {
		// 「【数当てゲーム】」と出力する
		System.out.println("【数当てゲーム】");
		
		// 0〜9までの整数の中からランダムな数を1つ生成して変数ansに代入
		int ans = new java.util.Random().nextInt(10);
		
		// 5回繰り返すループを作成
		for(int i = 0; i < 5; i++) {
			
			// 「0〜9の数字を入力してください」と出力
			System.out.println("0〜9の数字を入力してください");
			
			// 入力値をint型を持つ変数numに代入
			int num = new java.util.Scanner(System.in).nextInt();
			
			// 変数numとansが同値の場合、「アタリ！」と表示して繰り返しを終了し、違う場合は、「違います」と表示
			if(num == ans) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}
		}
		
		// 「ゲームを終了します」と出力する
		System.out.println("ゲームを終了します");
	}
}
