package com.ja.JavaBeginner;

public class Janken {
	public static void main(String[] args) {
		
		// 「名前を入力してください」と出力する
		System.out.println("名前を入力してださい");
		
		// 入力値をString型を持つ変数nameに格納
		String name = new java.util.Scanner(System.in).nextLine();
		
		// 「1〜3の数値を入力してください」と出力する
		System.out.println("1〜3の数値を入力してください");
		
		// 入力値をint型を持つ変数nameに格納
		int num = new java.util.Scanner(System.in).nextInt();
		
		// 1〜3以外の数値を入力した場合、強制終了する
		if (num > 3 || num < 1) {
			
			// GAME OVER!!と出力し、入力値を表示
			System.out.println("GAME OVER!!");
			System.out.println(num);
			
		} else {
			// 乱数を生成し、インクリメントする
			int ransu = new java.util.Random().nextInt(3);
			ransu++;
			
			// numとransuの値を比べて結果を出す
			if (num < ransu) {
				// Loserと出力する
				System.out.println("Loser");
			} else if (num == ransu) {
				// Drawと出力する
				System.out.println("Draw");
			} else {
				// Winnerと出力する
				System.out.println("Winner");
			}
			
			// 結果を表示する
			System.out.println(num + "：" + ransu);
		}
	}
}
