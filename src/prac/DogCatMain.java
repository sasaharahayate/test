package prac;

class Animal{
	private int age ;

	public Animal(int a) {
		age = a;
	}

	public void setAge(int a) {
		age = a;
	}

	public void walk() {
		System.out.println("歩く");
	}

	public int getAge() {
		return age;
	}

}

class Dog extends Animal{
	public Dog(int a){
		super(a);
	}

	public void bite() {
		System.out.println("噛みつく");
	}

}

class Cat extends Animal{
	public Cat(int a) {
		super(a);

	}

	public void scrabble() {
		System.out.println("ひっかく");
	}

}

public class DogCatMain {

	public static void main(String[] args) {
		Dog d1 = new Dog(10);
		d1.walk();
		d1.bite();

//		d1.setAge(10);
		System.out.println("犬の年齢 :"  + d1.getAge());

		System.out.println();

		Cat c1 = new Cat(5);
		d1.walk();
		c1.scrabble();

//		c1.setAge(5);
		System.out.println("猫の年齢 :" + c1.getAge());

	}

}
