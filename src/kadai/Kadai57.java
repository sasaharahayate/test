package kadai;

import java.util.Scanner;

public class Kadai57 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		//インスタンス化
		Test57 t = new Test57();

		//入力を受け取る
		System.out.print("整数値x : ");
		int x = scn.nextInt();

		//sign of メソッドの実行
		int result = t.signOf(x);

		//実行結果の出力
		System.out.println("signOf(x)は" + result + "です。");

		scn.close();
	}

}

class Test57{
	//sign ofメソッドを作る
	int signOf(int n) {
		int z = 0;

		if (n ==0) {
			z = 0;
		}else if(n <0) {
			z = -1;
		}else {
			z = 1;
		}
		 return z ;
	}
}
