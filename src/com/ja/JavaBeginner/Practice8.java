package com.ja.JavaBeginner;

/*
 * 数あてクイズ
 */

public class Practice8 {
	public static void main(String[] args) {
		// int型の配列numbersに初期値「3」、「4」、「9」を代入する
		int[] numbers = {3, 4, 9};
		
		// 「1桁の数字を入力してください」と出力する
		System.out.println("1桁の数字を入力してください");
		
		// 標準入力を受け付け、int型を持つ変数inputに代入する
		int input = new java.util.Scanner(System.in).nextInt();
		
		// 配列をループで回しながら、要素と等しければ「アタリ！」と表示させる
		for(int num : numbers) {
			if(input == num) {
				System.out.println("アタリ！");
			}
		}
	}
}
