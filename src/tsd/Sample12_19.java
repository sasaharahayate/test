package tsd;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Sample12_19 {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(12);
		array.add(123);
		array.add(1234);
		array.add(12345);

		//偶数のみ表示
		System.out.println("拡張for文を利用");
		for(int num : array) {
			if(num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();

		//Stream API
		System.out.println("Stream APIを利用");
		array.stream()
			.filter(num -> num % 2 == 0) //偶数のみを取り出す
			.forEach(i -> System.out.print(i + " ")); //取り出した数字を表示

		System.out.println();
		System.out.println("-------------");


		//1000以下の奇数
		System.out.println("拡張for文+if文");
		ArrayList<Integer> intArray1 = new ArrayList<>();

		for(int num : array) {
			if(num % 2 == 1) {
				if(num <= 1000) {
					intArray1.add(num); //1000以下の奇数を追加
				}
			}
		}
		System.out.println("intArray1 : " + intArray1);

		//要素がセットに含まれていない場合
		System.out.println("Stream APIを利用");
		ArrayList<Integer> intArray2 = (ArrayList<Integer>)(array.stream()
										.filter(num -> num % 2 == 1) //奇数を取り出す
										.filter(num -> num <= 1000) //1000以下を取り出す
										.collect(Collectors.toList()));

		System.out.println("intArray2 : " + intArray2);
	}

}
