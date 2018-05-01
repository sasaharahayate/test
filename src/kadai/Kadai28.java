package kadai;

import java.util.Scanner;

public class Kadai28 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("何cmから :");
		int min = scn.nextInt();
		System.out.print("何cmまで :");
		int max = scn.nextInt();
		System.out.print("何cmごと");
		int interval = scn.nextInt();

		scn.close();

		System.out.println("身長  標準体重");
		System.out.println("----------");

		for(int i = min ;i <= max ;i += interval) {
			System.out.println(i + "   " + (i - 100) * 0.9);

		}

	}

}
