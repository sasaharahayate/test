package kadai;

import java.util.Scanner;

public class Kadai30 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("整数 :");
		int x = scn.nextInt();

		for(int i = 1; i <= x; i++) {
			System.out.println(i + "の2乗は" + i * i);
		}
		scn.close();
	}

}
