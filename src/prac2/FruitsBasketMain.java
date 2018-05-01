package prac2;

import java.util.ArrayList;
import java.util.List;


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

class FruitsBasket{
	public List<Fruits> basket = new ArrayList<Fruits>();
	private int limit;

	public FruitsBasket(int limit) {
		this.limit = limit;
	}

	public void put(Fruits fruits) {
		if(basket.size() >= limit) {
			System.out.println("バスケットはいっぱいです。");
			return;
		}

		basket.add(fruits);
	}

	public Fruits take(int index) {
		return basket.remove(index);
	}

}


public class FruitsBasketMain {

	public static void main(String[] args) {
		//フルーツバスケットを作る
		FruitsBasket fb = new FruitsBasket(3);

		//フルーツをバスケットに入れる
		Fruits f1 = new Fruits("orange", "orange", 100);
		fb.put(f1);

		Fruits f2 = new Fruits("banana", "yellow", 100);
		Fruits f3 = new Fruits("apple", "red", 100);
		fb.put(f2);
		fb.put(f3);

		//4つ目を入れるとエラー
//		Fruits f4 = new Fruits("orange", "orange", 100);
//		fb.put(f4);

		//バスケットから取り出す
		Fruits f5 = fb.take(0);

	}

}
