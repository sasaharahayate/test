package prac2;

interface Summary{
	public int exec(int a, int b);
}

class SummaryImpl implements Summary{

	@Override
	public int exec(int a, int b) {
		return a + b;
	}

}

public class Prac13 {

	public static void main(String[] args) {
		//implements
		System.out.println(new SummaryImpl().exec(10, 5));

		//匿名クラス
		Summary sum1 = new Summary() {

			@Override
			public int exec(int a, int b) {
				return a + b;
			}
		};
		System.out.println(sum1.exec(10, 5));

		//ラムダ式
		Summary sum2 = (int a ,int b) -> {
			return a + b;
		};
		System.out.println(sum2.exec(10, 5));

	}

}
