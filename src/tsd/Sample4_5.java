package tsd;

import java.util.ArrayList;

public class Sample4_5 {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<>();

		String st1 = "ready";
		String st2 = "set";
		String st3 = "go";

		/*
		for(int i = 0;i< mylist.size();i++) {
			String st = (String) mylist.get(i);
			System.out.println(st);
		}
		*/



		mylist.add(st1);
		mylist.add(st2);
		mylist.add(st3);


		/*
		String st = null;
		Iterator<String> itr = mylist.iterator();

		while(itr.hasNext()) {
			st = itr.next();
			System.out.println(st);
		}


		for(String st : mylist) {
			System.out.println(st);
		}
		*/
	}

}
