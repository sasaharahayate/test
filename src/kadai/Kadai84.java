package kadai;

class Human{
	protected String name;
	protected int height;
	protected int weight;

	public Human(String name,int height,int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void addWeight(int w) {
		this.weight = weight + w;
	}

	public void delWeight(int w) {
		this.weight = weight - w;
	}
}

public class Kadai84 {

	public static void main(String[] args) {
		Human h1 = new Human("鈴木一郎", 180, 75);
		System.out.println("名前          :" + h1.getName());
		System.out.println("身長          :" + h1.getHeight());
		System.out.println("痩せる前の体重:" + h1.getWeight());
		h1.delWeight(13);
		System.out.println("痩せた後の体重:" + h1.getWeight());

		System.out.println();

		Human h2 = new Human("山田太郎", 165, 50);
		System.out.println("名前        :" + h2.getName());
		System.out.println("身長        :" + h2.getHeight());
		System.out.println("太る前の体重:" + h2.getWeight());
		h2.addWeight(22);
		System.out.println("太る後の体重:" + h2.getWeight());

	}

}
