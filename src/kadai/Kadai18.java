package kadai;

import java.util.Random;
import java.util.Scanner;

public class Kadai18 {

	public static void main(String[] args) {
		System.out.println("数当てゲーム開始！！");
		System.out.println("10～99の数字を当ててください");

		//2桁の数字をランダムに生成
		Random rnd = new Random();
		int num = rnd.nextInt(89) +11;

//		System.out.println(num);

		Scanner scn = new Scanner(System.in);
		System.out.print("いくつかな？ : ");
		int x = scn.nextInt();

		do {
			if(x < num) {
				System.out.print("もっと大きい数だよ。いくつかな？ :");
				x = scn.nextInt();
			}else if(num < x){
				System.out.print("もっと小さい数だよ。いくつかな？ :");
				x = scn.nextInt();
			}
		}while (x != num);


		System.out.print("正解です");



		scn.close();




	}

}
