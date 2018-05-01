package kadai;

public class Kadai07 {

	public static void main(String[] args) {
		int a = 10;
		int b = 21;
		int c ;

		System.out.println("整数a:"+a);
		System.out.println("整数b:"+b);

		if (a >= b) {
			c = a - b;
		}else {
			c = b - a;
		}

		if(c <= 10) {
			System.out.println("それらの差は10以下です");
		}else {
			System.out.println("それらの差は11以上です");
		}

	}

}
