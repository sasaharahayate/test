package kadai;

import java.util.Random;

public class Kadai11 {

	public static void main(String[] args) {
		int x = new Random().nextInt(3);

//		System.out.println(x);

		switch(x) {
		case 1:
			System.out.println("コンピュータが生成した手:チョキ");
			break;
		case 2:
			System.out.println("コンピュータが生成した手:パー");
			break;
		default:
			System.out.println("コンピュータが生成した手:グー");
		}
	}

}
