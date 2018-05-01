package kadai;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kadai45 {

	public static void main(String[] args) {

		//要素数の読み込み
		Scanner scn = new Scanner(System.in);
		System.out.print("要素数 : ");
		int cnt = (scn.nextInt() -1);

		ArrayList<Integer> array = new ArrayList<>();

		//乱数
		for(int i = 0 ; i <=cnt ; i++) {
			Random rnd = new Random();
			int num = rnd.nextInt(10) +1;
			array.add(num);
		}

		//グラフ
		for(int r = 10 ; 0 < r ; r--) {

			if (r != 0) {
				System.out.println();
			}

			for(int c = 0 ; c <= cnt ; c++) {
				if(r <= array.get(c) ){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
		}
		//改行
		System.out.println();

		//最下段
		for(int c = 0 ; c <= cnt ; c++) {
			System.out.print("--");
		}

		System.out.println();

		for(int c = 0 ; c <= cnt ; c++) {
			int x = c %= 10;
			System.out.print(x + " ");
		}

		scn.close();

	}

}
