package prac;

class Circle{
	private int radius ;

	public Circle(int r){
		radius = r;
	}

	public void setRadius(int r){
		radius = r ;
	}

	public int getRadius(){
		return radius;
	}

	public double getArea() {
		double area = radius * radius * 3.14;
		return area;
	}

}

class Square{
	private int side;

	public Square(int l) {
		side = l;
	}

	public void setSl(int l) {
		side = l;
	}

	public int getSl() {
		return side;
	}

	public int getArea() {
		int area = side * side;
		return area;
	}

}

class Cylinder{
	private Circle circle;
	private int height;

	public Cylinder(int h, Circle c) {
		height = h;
		circle = c;
	}

	public void setCylinder(Circle c) {
		circle = c;
	}

	public double getCylinder() {
		return height;
	}

	public double getVolume() {
		double volume = circle.getArea() * height;
		return volume;
	}

}

public class FigureMain {

	public static void main(String[] args) {
		Circle c1 = new Circle(10);
//		c1.setRadius(10);

//		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());


		Square s1 = new Square(5);
//		s1.setSl(5);

//		System.out.println(s1.getSl());
		System.out.println(s1.getArea());

		Circle circle = new Circle(10);
		Cylinder c2 = new Cylinder(5,circle);
		System.out.println(c2.getVolume());


	}

}
