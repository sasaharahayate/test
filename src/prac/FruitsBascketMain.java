//package prac;
//
//import java.util.ArrayList;
//
//class Fruits2{
//	private String name;
//	private String color;
//	private int price;
//
//	public Fruits2(String n ,String c ,int p){
//		name = n;
//		color = c;
//		price =p;
//	}
//
//	public String getName() {
//		return name;
//	}
//	public String getColor() {
//		return color;
//	}
//	public int getPrice() {
//		return price;
//	}
//
//}
//
//class FruitsBascket{
//	private ArrayList<Fruits> fruitsList = new ArrayList<>();
//	private int limit;
//
//	public FruitsBascket(int limit) {
//		this.limit = limit;
//
//	}
//
//	public void put(Fruits fruits){
//		if (fruitsList.size() == limit) {
//			System.out.println(fruits.getName() + "はもう入りません。");
//		}
//
//		System.out.println(fruits.getName() + "が入りました。");
//		fruitsList.add(fruits);
//
//	}
//
//	public Fruits take(int index) {
//		return fruitsList.remove(index);
//	}
//}
//
//public class FruitsBascketMain {
//
//	public static void main(String[] args) {
//		FruitsBascket fb = new FruitsBascket();
//
//		fb.put("banana");
//
//
//	}
//
//}
