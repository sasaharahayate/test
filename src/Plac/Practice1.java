package Plac;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		//数値の読み込み
		Scanner scn = new Scanner(System.in);
		System.out.print("aの値 :");
		int a = scn.nextInt();
		System.out.print("bの値 :");
		int b = scn.nextInt();

		//メソッド
		Kuraberu t = new Kuraberu();

		//a,bを属性として
		t.a = a ;
		t.b = b ;

		//出力
		int result = t.getBigger() ;
		System.out.println(result);

		scn.close();
	}

}

class Kuraberu{

	int a ;
	int b ;

	int getBigger() {

		if(a <= b) {
			return b;
		}else {
			return a;
		}
	}
}