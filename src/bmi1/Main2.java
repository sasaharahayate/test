//package bmi2;
//
//abstract class Origin{ //スーパークラス
//	//Human Child で共通の変数
//	private double max;
//	private double min;
//	private String name;
//	private double height;
//	private double weight;
//
//	//コンストラクタ
//	public Origin(String name,double height,double weight,double max,double min) {
//		this.name = name;
//		this.height = height;
//		this.weight = weight;
//		this.max = max;;
//		this.min = min;
//	}
//
//	//ゲッター
//	public String getName() {
//		return name;
//	}
//
//	public double getHeight() {
//		return height;
//	}
//
//	public double getWeight() {
//		return weight;
//	}
//
//	public double getMax() {
//		return max;
//	}
//
//	public double getMin() {
//		return min;
//	}
//}
//
//class Human extends Origin{
//
//	public Human(String name,double height,double weight) {
//		super(name , height ,weight,25,18.5);
//	}
//
//}
//
//class Child extends Origin{
//
//	public Child(String name,double height,double weight) {
//		super(name , height ,weight,18.0,15.0);
//	}
//
//}
//
//class BMI{
//
//	public static double calc(Origin c) {
//		double bmi =   c.getWeight() / c.getHeight() / c.getHeight() ; //.getWeight()/.getHeight()/.getHeight();
//		return bmi;
//	}
//
//	public static String judge(Origin c) {
//
//		if(c.getMax() < BMI.calc(c)) {
//			return "太りすぎです";
//		}else if(c.getMin() <= BMI.calc(c) ) {
//			return "標準です";
//		}else {
//			return "痩せすぎです";
//		}
//	}
//
//	/* オーバーロードは使わない
//	public static double calc(Human h){
//		double BMI = h.getWeight()/h.getHeight()/h.getHeight();
//		return BMI;
//	}
//
//	public static double calc(Child c) {
//		double BMI = c.getWeight()/c.getHeight()/c.getHeight();
//		return BMI;
//	}
//
//	public static String judge(Human h) {
//		double bmi = calc(h);
//		if(Human.MAX < bmi) {
//			return "太りすぎです";
//		}else if(Human.MIN <= bmi) {
//			return "標準です";
//		}else {
//			return "痩せすぎです";
//		}
//	}
//
//	public static String judge(Child c) {
//		double bmi = calc(c);
//		if(Child.MAX < bmi) {
//			return "太りすぎです";
//		}else if(Child.MIN <= bmi) {
//			return "標準です" ;
//		}else {
//			return "痩せすぎです" ;
//		}
//	}
//	*/
//
//}
//
//public class Main2 {
//
//	public static void main(String[] args) {
//		Human h = new Human("kato", 1.77, 69.5);
//		System.out.println("----- BMI -----");
//		System.out.println(h.getName() + "さんのBMIは" + BMI.calc(h));
//		System.out.println(BMI.judge(h));
//		System.out.println("---------------");
//
//		System.out.println();
//
//		Child c = new Child("taro", 1.77, 69.5);
//		System.out.println("----- BMI -----");
//		System.out.println(c.getName() + "ちゃんのBMIは" + BMI.calc(c));
//		System.out.println(BMI.judge(c));
//		System.out.println("---------------");
//	}
//
//}
