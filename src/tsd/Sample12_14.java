package tsd;

public class Sample12_14 {

	public static void main(String[] args) {
		//-128～127は同じ参照先
		Integer wi1 = 100;
		Integer wi2 = 100;
		int i = 100;

		if(wi1 == 100) System.out.println("wi1 == 100");
		if(wi1 == wi2) System.out.println("wi1 == wi2");
		if(wi1 == i) System.out.println("wi1 == i");
		if(wi2 == i) System.out.println("wi2 == i");

		if(wi1.equals(100)) System.out.println("w1.equals(100)");
		if(wi1.equals(wi2)) System.out.println("w1.equals(wi2)");
		if(wi1.equals(i)) System.out.println("w1.equals(i)");
		if(wi2.equals(i)) System.out.println("w2.equals(i)");

//		//エラー iは基本データ型なのでメソッドを呼び出せない
//		if(i.equals(wi1)) System.out.println("i.equals(wi1)");

	}

}
