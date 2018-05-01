package Plac;

public class Rennshu05 {

	public static void main(String[] args) {

		for (int i = 1 ; i <= 100 ; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " Fizz Buzz");
			}else if (i % 5 == 0) {
				System.out.println(i + " Bizz");
			}else if (i % 3 == 0){
				System.out.println(i + " Fizz");
			}else {
				System.out.println(i);
			}

		}

	}

}
