package tsd;

public class Sample7_3 {

	public static void main(String[] args) {
		int [] x = {0,1,2,3,4};

		try {
			System.out.println("x[6]: " + x[6]);
			System.out.println("x[3]: " + x[3]);
		}catch (ArithmeticException ae) {//算術演算子の例外
			System.out.println("発生した例外: " + ae);
		}catch(ArrayIndexOutOfBoundsException oe) {
			//配列の例外
			System.out.println("Array index out of bound! ");
		}catch(IndexOutOfBoundsException ie) {
			//配列の範囲外
			System.out.println("Some kind of index out of executed!");
		}finally {
			System.out.println("Finally block must be executed");
		}
		System.out.println("x[0]: " + x[0]);
	}

}
