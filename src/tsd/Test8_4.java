package tsd;

public class Test8_4 {

	public static void main(String[] args) {
		Test8_4 t = new Test8_4();

		t.testMethod(new Int(){
			@Override
			public void method(String s) {
				System.out.println(s);
			}
		});
	}

	void testMethod(Int i) {
		System.out.println("testMethod");
		i.method("hello");
	}

}

interface Int{
	public void method(String s);
}
