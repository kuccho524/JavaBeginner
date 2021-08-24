package com.ja.JavaBeginner;

public class Practice7 {
	public static void main(String[] args) {
		// int型の配列moneyListに要素を３つ代入する
		int[] moneyList = {121902, 8302, 55100};
		
		// 上記の配列をfor文で取り出す
		for(int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		
		// 上記を拡張for文で取り出す
		for(int val : moneyList) {
			System.out.println(val);
		}
	}
}
