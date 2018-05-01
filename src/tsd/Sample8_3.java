package tsd;

public class Sample8_3 {

	public static void main(String[] args) {
		LocalOuter outer = new LocalOuter();
		outer.method("param1", "param2");
	}

}

class LocalOuter{//外部クラス
	private String outerVal = "outerVal";

	public void method(final String param1,String param2) {//外部クラスのメソッド
		final int x = 10;
		int y = 20; //finalとみなす

		class LocalInner{//外部クラスのメソッド内＝ローカルクラス
			void method() {
				System.out.println("outerVal: " +outerVal);
				System.out.println("x       : " + x);
				System.out.println("y       : " + y);

				System.out.println("param1  : " + param1);
				System.out.println("param2  : " + param2);
			}
		}
		LocalInner inner = new LocalInner();
		inner.method();
		outerVal = "Hello";
	}
}
