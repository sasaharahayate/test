package kadai;

import java.util.Scanner;

public class Kadai13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("0～7の数字を入力してください。対応した曜日を出力します。 :");
		int num =scn.nextInt();

		switch(num) {
		case 0 :
			System.out.println("日曜日");
			break;
		case 1 :
			System.out.println("月曜日");
			break;
		case 2 :
			System.out.println("火曜日");
			break;
		case 3 :
			System.out.println("水曜日");
			break;
		case 4 :
			System.out.println("木曜日");
			break;
		case 5 :
			System.out.println("金曜日");
			break;
		case 6 :
			System.out.println("土曜日");
			break;
		case 7 :
			System.out.println("日曜日");
			break;
		default :
			System.out.println("0～7の範囲で入力してください");
		}

		scn.close();
	}

}
