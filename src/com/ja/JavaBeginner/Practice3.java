package com.ja.JavaBeginner;

/*
 * 「占いの館」
 */

public class Practice3 {
	public static void main(String[] args) {
		
		// 「ようこそ占いの館へ」と出力する
		System.out.println("ようこそ占いの館へ");
		
		// 「あなたの名前を入力してください」と出力する
		System.out.println("あなたの名前を入力してください");
		
		// 文字入力を受け付け、String型を持つ変数nameに格納
		String name = new java.util.Scanner(System.in).nextLine();
		
		// 「あなたの年齢を入力してください」と出力する
		System.out.println("あなたの年齢を入力してください");
		
		// 文字入力を受け付け、String型を持つ変数ageStringに格納
		String ageString = new java.util.Scanner(System.in).nextLine();
		
		// 変数ageStringをint型に変換し、int型を持つ変数ageに代入
		int age = Integer.parseInt(ageString); // Integer.parseInt()で、()をint型に変換する
		
		// 0〜3までの乱数を生成し、int型を持つ変数fortuneに代入
		int fortune = new java.util.Random().nextInt(4);
		
		// 変数fortuneの値をインクリメント演算子で1増やす
		fortune++;
		
		// 「占いの結果が出ました」と出力
		System.out.println("占いの結果が出ました！");
		
		// 結果を表示する
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です。");
		
		// 各数値と運勢を表示する
		System.out.println("１：大吉 ２：中吉 ３：吉 ４：凶");
	}
}
