package kadai;

public class Kadai05 {

	public static void main(String[] args) {
		double a = 100;
		double b = -10;

		System.out.println("実数a:"+a);
		System.out.println("実数b:"+b);

		if (a == b) {
//			System.out.println("整数a:"+a);
//			System.out.println("整数b:"+b);
			System.out.println("同じ値です");
		}else if(a > b){
//			System.out.println("整数a:"+a);
//			System.out.println("整数b:"+b);
			System.out.println("大きいほうの値は"+a+"です。");
		}else {
//			System.out.println("整数a:"+a);
//			System.out.println("整数b:"+b);
			System.out.println("大きいほうの値は"+b+"です。");
		}
	}

}
