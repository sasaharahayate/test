package kadai;

public class Kadai08 {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		int c = 10;

		System.out.println("整数a:"+a);
		System.out.println("整数b:"+b);
		System.out.println("整数c:"+c);

		int m ;

		if (a < b && a < c) {
			m = a;
		}else if(b < a && b < c) {
			m = b;
		}else {
			m = c;
		}

		System.out.println("最小値は" + m + "です。");

	}

}
