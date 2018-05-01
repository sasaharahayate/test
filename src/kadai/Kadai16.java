package kadai;

import java.util.Scanner;

public class Kadai16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int c ;

		do {
			System.out.print("整数値:");
			int x = scn.nextInt();

			if (x == 0) {
				System.out.println("その数値は0です。");
			} else if (x < 0) {
				System.out.println("その数値は負です。");
			} else {
				System.out.println("その数値は正です。");
			}

			System.out.print("もう一度？ 1…Yes/0…No :");
			c = scn.nextInt();
		}while (c == 1);

		scn.close();

//		if (a == 0) {
//			System.out.println("その数値は0です。");
//		} else if (a <= 0) {
//			System.out.println("その数値は負です。");
//		} else {
//			System.out.println("その数値は正です。");
//		}

	}

}
