package tsd;

abstract class Car610{
	Car610(){
		System.out.println("自動車を作成します");
	}

	public abstract  String setLight();
}

class CarA extends Car610{
	CarA(){
		System.out.println("A社のパーツを使います。");
	}

	@Override
	public String setLight() {
		return "丸ライト";
	}
}

class CarB extends Car610{
	CarB(){
		System.out.println("B社のパーツを使います。");
	}

	@Override
	public String setLight() {
		return "四角ライト";
	}
}

public class Sample6_10 {

	public static void main(String[] args) {
		Car610 a1 = new CarA();
		System.out.println("ライトは" + a1.setLight() + "を取り付けました");

		System.out.println();

		Car610 b1 = new CarB();
		System.out.println("ライトは" + b1.setLight() + "を取り付けました");

	}

}
