package kadai;

import java.util.Scanner;

public class Kadai22 {

	public static void main(String[] args) {
		System.out.println("正の整数値の桁数を求めます。");

		System.out.print("正の整数値 : ");
		Scanner scn = new Scanner(System.in);
		double x = scn.nextInt();

		scn.close();

		double count = 1;

		while(x >= 10){
			x = x/10;
			count++;
		}

		System.out.println((int)count);


	}

}
