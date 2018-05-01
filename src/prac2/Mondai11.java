package prac2;

public class Mondai11 {

	public static void main(String[] args) {
		String[] a = { "5", "23", "a", "89", "b", "c" };


		int []b = Mondai11.makeArray3(a);

		for(int i : b) {
			System.out.println(i);
		}

	}

	public static int[] makeArray1(String[] a) {
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			try {
				b[i] = Integer.parseInt(a[i]);
			} catch (NumberFormatException e) {
//				e.printStackTrace();
			}
		}
		return b;
	}

	public static int[] makeArray2(String[] a) {
		int[] b = new int[a.length];

		try {
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
		} catch (NumberFormatException e) {
//			e.printStackTrace();
		}
		return b;
	}

	public static int[] makeArray3(String[] a) {
		int[] b = new int[a.length];

		try {
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
		} catch (NumberFormatException e) {
			for (int i = 0; i < a.length; i++) {
				b[i] = 0;
			}
		}
		return b;
	}

}
