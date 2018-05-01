package bmi3;

abstract interface Origin{

	public abstract String getName();
	public abstract double getHeight();
	public abstract double getWeight();
	public abstract double getMax();
	public abstract double getMin();
}

class Human implements Origin{
	public static final double MAX = 25.0;
	public static final double MIN = 18.5;
	private String name;
	private double height;
	private double weight;

	public Human(String name ,double height,double weight) {
		this.name = name;
		this.weight = weight;
		this.height =height;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public double getMax() {
		return MAX;
	}

	public double getMin() {
		return MIN;
	}
}

class Child implements Origin{
	public static final double MAX = 18.0;
	public static final double MIN = 15.0;
	private String name;
	private double height;
	private double weight;

	public Child(String name ,double height,double weight) {
		this.name = name;
		this.weight = weight;
		this.height =height;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public double getMax() {
		return MAX;
	}

	public double getMin() {
		return MIN;
	}
}

class BMI{

	public static double calc(Origin o) {
		double bmi = o.getWeight() / o.getHeight() / o.getHeight();
		return bmi;
	}

	public static String judge(Origin o) {
		double bmi = calc(o);
		if(o.getMax() < bmi) {
			return "太りすぎです";
		}else if (bmi < o.getMin()){
			return "標準です";
		}else {
			return "痩せすぎです";
		}
	}
}

public class Main3 {

	public static void main(String[] args) {
		Human h = new Human("kato", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(h.getName() + "さんのBMIは" + BMI.calc(h));
		System.out.println(BMI.judge(h));
		System.out.println("---------------");

		System.out.println();

		Child c = new Child("taro", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(c.getName() + "ちゃんのBMIは" + BMI.calc(c));
		System.out.println(BMI.judge(c));
		System.out.println("---------------");
	}

}
