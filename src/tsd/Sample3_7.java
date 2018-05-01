package tsd;

public class Sample3_7 {

	public static void main(String[] args) {
		int cnt = 1;
		int sum = 0;

		while (cnt <= 10) {
			sum += cnt;
			cnt++;
		}

		System.out.println("1から10までの総和は" + sum + "です。");

		
		int sum2 = 0;

		for (int cnt2 = 1; cnt2 <=10; cnt2++) {
			sum2 = sum2 + cnt2;
		}

		System.out.println("1から10までの総和は" + sum2 + "です。");
	}

}
