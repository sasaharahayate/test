package kadai;

public class Kadai04 {

	public static void main(String[] args) {
		int x = 120;

		if (x < 0 || x > 100) {
			System.out.println("得点:"+x);
			System.out.println("不正な点数です");
		}else if (x >= 80) {
			System.out.println("得点:"+x);
			System.out.println("優");
		}else if (x >= 70) {
			System.out.println("得点:"+x);
			System.out.println("良");
		}else if(x >= 60) {
			System.out.println("得点:"+x);
			System.out.println("可");
		}else {
			System.out.println("得点:"+x);
			System.out.println("不可");
		}

	}

}
