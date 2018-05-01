package kadai;

import java.util.Scanner;

public class Kadai23 {

	public static void main(String[] args) {
		System.out.print("正の整数値 : ");

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		scn.close();

		int i = 1;
		int a = 1;

		do {
			a =  a * i;
			i++;
		}while(i < n + 1);

		System.out.println("1から" + n + "までの積は"+ a + "です。");
	}

}
