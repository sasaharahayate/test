package prac;

import java.util.function.Predicate;

class PredicateImpl implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}

}

public class Test_8 {

	public static void main(String[] args) {

		PredicateImpl pre1 = new PredicateImpl();

		System.out.println(pre1.test("なにか"));


		Predicate<String> pre2 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}
		};

		Predicate<String> pre3 = (String t) -> {
			return t.length() >= 10;
		};

	}
}
