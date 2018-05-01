package kadai;

import java.util.Scanner;

public class Kadai19 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("整数A:" );
		int a = scn.nextInt();

		System.out.print("整数B:" );
		int b = scn.nextInt();

		scn.close();

		if (a >= b) {
			while (a >= b) {
				System.out.print(b + " ");
				b++ ;
			}
		} else {
			while (b >= a) {
				System.out.print(a + " ");
				a++;
			}
		}


	}

}