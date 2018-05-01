package kadai;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kadai47 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("要素数 :");
		int cnt = scn.nextInt();

		ArrayList<Integer> array = new ArrayList<>();

		for(int i = 0;i < cnt; i++) {
			Random rnd = new Random();
			int num = rnd.nextInt(10) + 1;
			array.add(num);
			System.out.println("a[" + i + "]" + array.get(i));
		}
		scn.close();


	}

}
