package kadai;

public class Kadai27 {

	public static void main(String[] args) {
		int n = 3;

		System.out.println("1からnまでの和を求めます。");
		System.out.println("nの値:" + n);

		int x = 0 ;

		for (int i = 1; i <= n ; i++) {
			x = x + i;

			if (i <= 1) {
				System.out.print(i);
			}else {
				System.out.print("+" + i);
			}
		}


		System.out.println("=" + x );

	}

}
