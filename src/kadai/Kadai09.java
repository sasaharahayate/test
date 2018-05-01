package kadai;

public class Kadai09 {

	public static void main(String[] args) {
		int a = 20;
		int b = 2;

		System.out.println("整数a:"+a);
		System.out.println("整数b:"+b);

		if (a == b) {
			System.out.println("二つの値は同じです。");
		}else if (a > b) {
			System.out.println("大きいほうの値は" + a + "です。");
			System.out.println("小さいほうの値は" + b + "です。");
		}else {
			System.out.println("大きいほうの値は" + b + "です。");
			System.out.println("小さいほうの値は" + a + "です。");
		}

	}

}
