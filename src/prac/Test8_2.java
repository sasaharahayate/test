package prac;

import java.util.function.Predicate;

class PredicateImpl2 implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}

}


public class Test8_2 {

	public static void main(String[] args) {
		//implements
		PredicateImpl2 p1 = new PredicateImpl2();

		System.out.println(p1.test("もじれつ"));

		//匿名クラス
		Predicate<String> p2 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}
		};
		System.out.println(p2.test("abcbbbbbbbbbbb"));

		//ラムダ式
		Predicate<String> p3 = (String t) -> {
			return t.length() >= 10;
		};
		System.out.println(p3.test("abc"));


	}

}
