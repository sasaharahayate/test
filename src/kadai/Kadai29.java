package kadai;

import java.util.Scanner;

public class Kadai29 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("何個 * を表示しますか : ");
		int x = scn.nextInt();
		scn.close();

		for(int i = 1;i <=x;i++) {
			System.out.println();

			for(int j = 0;j <= 5;j++) {
				System.out.print("*");
			}
		}
	}

}
