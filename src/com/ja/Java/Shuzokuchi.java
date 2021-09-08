package com.ja.Java;

public class Shuzokuchi {
	public static void main(String[] args) {
		
		System.out.println("ポケモンを入力してください");
		String pokemon = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("種族値を入力してください");
		
		System.out.print("hp：");
		int hp = new java.util.Scanner(System.in).nextInt();
		System.out.print("a：");
		int a = new java.util.Scanner(System.in).nextInt();
		System.out.print("b：");
		int b = new java.util.Scanner(System.in).nextInt();
		System.out.print("c：");
		int c = new java.util.Scanner(System.in).nextInt();
		System.out.print("d：");
		int d = new java.util.Scanner(System.in).nextInt();
		System.out.print("s：");
		int s = new java.util.Scanner(System.in).nextInt();
		
		int total = hp + a + b + c + d + s;
		System.out.println("合計種族値は" + total + "です。");
	}
}
