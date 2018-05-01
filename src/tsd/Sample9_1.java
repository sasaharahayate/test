package tsd;

import java.time.LocalDate;
import java.time.Period;

public class Sample9_1 {

	public static void main(String[] args) {
		//日付を取得
		LocalDate date = LocalDate.of(2016, 12, 31);
		System.out.println("date            :" +date);
		System.out.println("date.plusDays(1):" + date.plusDays(1));
		//dateはそのまま
		System.out.println("date            :" + date);

		//現在の日付を取得
		LocalDate now = LocalDate.now();
		System.out.println("今日の日付      :" + now);
		LocalDate tomorrow = now.plusDays(1);
		System.out.println("明日の日付      :" + tomorrow);

		//対象日までの日数を取得
		Period p = now.until(tomorrow);

		System.out.println(p.getDays());
	}

}
