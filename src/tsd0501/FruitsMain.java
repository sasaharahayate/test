package tsd0501;

import java.util.ArrayList;

class Fruits{
	private String name;
	private String color;
	private int price;

	Fruits(String name,String color,int price){
		this.name = name;
		this.color = color;
		this.price = price;
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
}

public class FruitsMain {

	public static void main(String[] args) {
		ArrayList<Fruits> fruits = new ArrayList<>();

		fruits.add(new Fruits("orange","orange",80));
		fruits.add(new Fruits("banana","yellow",120));
		fruits.add(new Fruits("apple","red",100));

		for(int i = 0; i <fruits.size(); i++) {
			System.out.println(	"name:" + fruits.get(i).getName() +
								" color:" + fruits.get(i).getColor() +
								" price:" + fruits.get(i).getPrice());
		}


//		Fruits f1 = new Fruits("orange", "orange", 100);
//
//		System.out.println("name  :" + f1.getName());
//		System.out.println("color :" + f1.getColor());
//		System.out.println("price :" + f1.getPrice());

	}

}
