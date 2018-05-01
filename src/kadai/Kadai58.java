package kadai;

import java.util.Scanner;

public class Kadai58 {

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
		Test58 t = new Test58();
		int result =t.min(a,b,c);

		//出力
		System.out.println("最小値は" + result + "です。");
		scn.close();
	}

}

class Test58{
	int min(int a,int b,int c) {

		if(a <= b && a <=c) {
			return a;
		}else if(b <= a && b <= c) {
			return b;
		}else {
			return c;
		}

	}
}
