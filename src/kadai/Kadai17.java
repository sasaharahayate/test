package kadai;

import java.util.Scanner;

public class Kadai17 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

//		System.out.println("3桁の正の整数値:");
//		int x = scn.nextInt();
//		scn.close();

//		System.out.println( x + "と入力しましたね。");


		int x;

		do {
			System.out.print("3桁の正の整数値:");
			x = scn.nextInt();

		} while (x < 99 || x > 1000);

		scn.close();
		System.out.println( x + "と入力しましたね。");

	}

}
