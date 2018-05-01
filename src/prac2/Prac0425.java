package prac2;

import java.util.function.Predicate;

class PredicateImpl implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}

}

public class Prac0425 {

	public static void main(String[] args) {
		//1.implements
		PredicateImpl pre = new PredicateImpl();

		System.out.println(pre.test("tst"));

		//2.匿名クラス
		Predicate<String> pre2 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}

		};
		System.out.println(pre2.test("1234567890"));

		//3.ラムダ式
		Predicate<String> pre3 = (String t) -> {
			return t.length() >= 10;
		};
		System.out.println(pre3.test("123456789"));

	}

}
