package kadai;

import java.util.Scanner;

public class Kadai15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("整数 :");
		String num = scn.nextLine();

		try {
			int n =Integer.parseInt(num);

			switch(n % 2){
			case 0:
				System.out.println("入力された値は偶数です。");
				break;
			case 1:
				System.out.println("入力された値は奇数です。");
			}

		}catch(NumberFormatException e){
//			e.printStackTrace();
			System.out.println("数字を入力してください");
		}
//
//		switch(n % 2){
//		case 0:
//			System.out.println("入力された値は偶数です。");
//			break;
//		case 1:
//			System.out.println("入力された値は奇数です。");
//		}


		scn.close();
	}

}
