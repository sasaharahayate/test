package kadai;

import java.util.Scanner;

public class Kadai14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("整数 :");
		int num = scn.nextInt();

		switch(num % 3) {
		case 0 :
			System.out.println("入力された値は 3 の倍数です。");
			break;
		case 1 :
			System.out.println("入力された値を 3 で割ると余りは １ です。");
			break;
		case 2 :
			System.out.println("入力された値に 1 を足すと 3 の倍数になります。");
			break;

		}

		scn.close();


	}

}
