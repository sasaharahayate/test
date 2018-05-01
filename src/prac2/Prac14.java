package prac2;

import java.util.Arrays;
import java.util.Comparator;

class LengthSort implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 < o2 ? 1 : -1;
	}

}

public class Prac14 {

	public static void main(String[] args) {
		String[] array = {"abc", "abcdefg", "a", "ab", "cdef"};

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
