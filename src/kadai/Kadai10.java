package kadai;

public class Kadai10 {

	public static void main(String[] args) {
		int a = 50;
		int b = 40;
		int c = 50;

		System.out.println("変数a:" + a);
		System.out.println("変数b:" + b);
		System.out.println("変数c:" + c);

		System.out.println("a≦b≦cとなるようにソートしました。");

		int m1 ;
		int m2 ;
		int m3 ;

		if (a <= b && a <= c) {
			m1 = a;
		}else if (b <= a && b <= c) {
			m1 = b;
		}else {
			m1 = c;
		}

		if (a >= b && a >= c) {
			m3 = a;
		}else if (b >= a && b >= c) {
			m3 = b;
		}else {
			m3 = c;
		}

		if (m1 != a && m3 != a) {
			m2 = a;
		}else if (m1 != b && m3 != b) {
			m2 = b;
		}else {
			m2 = c;
		}

		a = m1;
		b = m2;
		c = m3;


		System.out.println("変数aは"+ a + "です。");
		System.out.println("変数bは"+ b + "です。");
		System.out.println("変数cは"+ c + "です。");

	}

}
