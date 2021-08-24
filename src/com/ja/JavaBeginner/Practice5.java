package com.ja.JavaBeginner;

public class Practice5 {
	public static void main(String[] args) {
		
		// 画面にメニューを表示させる
		System.out.print("1：検索 2：登録 3：削除 4：変更>");
		
		// int型を持つ変数selectedに入力した数字を代入する
		int selected = new java.util.Scanner(System.in).nextInt();
		
		// switch文で各値に対しての表示を分岐する
		switch(selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		default:
		}
	}
}
