package prac;

import java.util.ArrayList;


class Fruits{
	private String name;
	private String color;
	private int price;

	public Fruits(String n ,String c ,int p){
		name = n;
		color = c;
		price =p;
	}

	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}

//	public void show() {
//		System.out.println("name:" + name + "  color:" + color + "  price:" + price);
//	}

}

public class FruitsMain {

	public static void main(String[] args) {
		ArrayList<Fruits> fruits = new ArrayList<>();

		fruits.add(new Fruits("orange","orange",100));
		fruits.add(new Fruits("banana","yellow",200));
		fruits.add(new Fruits("apple","red",300));

//		for(Fruits f : fruits) {
//			f.show();
//		}

		for(int i = 0; i < fruits.size() ; i++) {
			System.out.println(	"name:" + fruits.get(i).getName() +
								"  color:" + fruits.get(i).getColor() +
								"  price:" + fruits.get(i).getPrice());
		}
	}

}
