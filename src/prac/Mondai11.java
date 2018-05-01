package prac;

public class Mondai11 {

	public static void main(String[] args) {
		String[] a = { "5", "23", "a", "89", "b", "c" };

		//Array
		Mondai11 obj = new Mondai11();
		int[] b = obj.makeArray3(a);

		for (int i : b) {
			System.out.println(i);
		}

	}

	int[] makeArray1(String[] a) {
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			try {
				b[i] = Integer.parseInt(a[i]);
			} catch (NumberFormatException e) {

			}
		}
		return b;
	}

	int[] makeArray2(String[] a) {
		int[] b = new int[a.length];

		try {
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
		} catch (NumberFormatException e) {

		}
		return b;
	}

	int[] makeArray3(String[] a) {
		int[] b = new int[a.length];

		try {
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
//			return b;
		} catch (NumberFormatException e) {
			for (int i = 0; i < a.length; i++) {
				b[i] = 0;
//			return new int[a.length];
			}
		}
		return b;
	}

}
