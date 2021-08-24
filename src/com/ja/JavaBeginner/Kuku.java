package com.ja.JavaBeginner;

/*
 * 九九を表示する
 */

public class Kuku {
	public static void main(String[] args) {
		
		// int型を持つ変数i, jを宣言し、かける数、かけられる数を繰り返す
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}
	}
}
