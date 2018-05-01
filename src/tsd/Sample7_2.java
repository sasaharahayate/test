package tsd;

public class Sample7_2 {
	public static void main(String[] args) {
		int x = 15;
		int y = 0;

		try {
			System.out.println("x / y: " + x / y); //例外発生
			System.out.println("2 * y: " + x * y);
		}catch(ArithmeticException ae) {
			System.out.println("発生した例外: " +ae);
			ae.printStackTrace();
//			System.out.println(ae.getMessage());
		}finally {


			try {
				System.out.println("x / y: " + x / y); //例外発生
				System.out.println("2 * y: " + x * y);
			}catch(ArithmeticException ae) {
				System.out.println("発生した例外: " +ae);
				ae.printStackTrace();
//				System.out.println(ae.getMessage());
			}finally{
				System.out.println("finallyブロック。必ず実行されます。");
			}
		}
		System.out.println("x - y: " + (x - y));
	}

}
