package kadai;

import java.util.Scanner;

public class Kadai46 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("人数 : ");
		int cnt = scn.nextInt();
		int[] x = new int[cnt];

		System.out.println("点数を入力せよ。");

		for(int i = 0 ; i < cnt ; i++) {
			System.out.print((i + 1)+ "番目の点数 : ");
			int scr = scn.nextInt();
			x[i] = scr ;
		}

		double sum = 0 ;
		double ave = 0 ;
		int min = x[0] ;
		int max = x[0] ;


		for(int i = 0 ; i < cnt ; i++) {
			sum = sum + x[i];

			if(min < x[i]) {
				min = x[i];
			}

			if(x[i] < max) {
				max = x[i];
			}

		}

		System.out.println("合計点は" + (int)sum + "点です。");

		ave = (sum / cnt);
		System.out.println("平均点は" + ave + "点です。");
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
		scn.close();

	}


}
