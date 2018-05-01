package kadai;

import java.util.Scanner;

public class Kadai59 {

	public static void main(String[] args) {
		//読み込み
		Scanner scn = new Scanner(System.in);

		System.out.print("整数a : ");
		int a = scn.nextInt();
		System.out.print("整数b : ");
		int b = scn.nextInt();
		System.out.print("整数c : ");
		int c = scn.nextInt();

		//メソッド実行
		Test59 t = new Test59();
		int result =t.med(a,b,c);

		//出力
		System.out.println("中央値は" + result + "です。");
		scn.close();
	}

}

class Test59{
	int med(int a,int b,int c) {
		int z = 0 ;

		//aが最小値
		if(a <= b && a <= c) {
			if(b <= c) {
				z = b;
			}else {
				z = c;
			}

		//bが最小値
		}else if(b <= a && b <= c) {
			if(a <= c) {
				z = a;
			}else {
				z = c;
			}

		//cが最小値
		}else {
			if(a <=b) {
				z = a;
			}else {
				z = b;
			}
		}

		return z ;

	}
}
