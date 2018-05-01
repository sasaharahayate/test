package kadai;

import java.util.Scanner;

public class Kadai21 {

	public static void main(String[] args) {

		System.out.print("何個表示しますか : ");

		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();

//		System.out.println(x);

		scn.close();

		int i = 0 ;

		do {
			if(i % 2 ==0) {
				System.out.print("* ");
			}else {
				System.out.print("+ ");
			}
			i++;
		}while(i < x);
	}

}
