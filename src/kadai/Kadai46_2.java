package kadai;

import java.util.ArrayList;
import java.util.Scanner;

public class Kadai46_2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("人数 : ");
		int cnt = scn.nextInt();
		ArrayList<Integer> array = new ArrayList<>();

		System.out.println("点数を入力せよ。");


		for(int i = 0 ; i < cnt ; i++) {
			System.out.print((i + 1)+ "番目の点数 : ");
			array.add(scn.nextInt());
		}

		int sum = 0 ;
		double ave = 0 ;
		int min =  array.get(0);
		int max =  array.get(0);


		for(int i = 0 ; i < cnt ; i++) {
			sum = sum + array.get(i);

			if(min < array.get(i)) {
				min = array.get(i);
			}

			if(array.get(i) < max) {
				max = array.get(i);
			}

		}

		System.out.println("合計点は" + sum + "点です。");

		ave = ((double)sum / cnt);
		System.out.println("平均点は" + ave + "点です。");
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
		scn.close();

	}

}
