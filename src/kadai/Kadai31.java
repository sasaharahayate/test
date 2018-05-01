package kadai;

import java.util.Scanner;

public class Kadai31 {

	public static void main(String[] args) {
		System.out.println("正方形を表示します");

		Scanner scn = new Scanner(System.in);
		System.out.println("段数は :");
		int x = scn.nextInt();

		for(int i = 1; i <= x ; i++) {

			for(int j = 1; j <= x ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		scn.close();
	}

}
