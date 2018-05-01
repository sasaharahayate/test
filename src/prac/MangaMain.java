package prac;

class Book{
	private String title;
	private int price;

	public Book(String title,int price){
		this.title = title;
		this.price = price;
	}

	public void read() {
		System.out.println("読む");
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

}
class Manga extends Book{
	public Manga(String title, int price) {
		super(title ,price);
	}

	public void watch() {
		System.out.println("見る");
	}
}

class Novel extends Book{
	public Novel(String title, int price) {
		super(title, price);

	}
	public void image() {
		System.out.println("想像する");
	}

}

public class MangaMain {

	public static void main(String[] args) {
		Manga m1 = new  Manga("マンガ",400);

		//マンガ表示
		System.out.println(m1.getTitle());
		System.out.println(m1.getPrice());
		m1.read();
		m1.watch();

		System.out.println();

		//小説表示
		Novel n1 = new  Novel("小説",800);

		System.out.println(n1.getTitle());
		System.out.println(n1.getPrice());
		n1.read();
		n1.image();

	}

}
