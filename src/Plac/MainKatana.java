package Plac;

import java.util.ArrayList;

class Katana{
	String name;
	String type;
	String kana;

	Katana(String l, String m ,String n){
		name = l;
		type = m;
		kana = n;
	}

	void show(){
		System.out.println("名前 :" + name + "、種類 :" + type + "読み仮名 :" + kana);
	}
}

public class MainKatana {

	public static void main(String[] args) {
		ArrayList<Katana> katanas = new ArrayList<>();

		katanas.add(new Katana("大包平","太刀","オオカネヒラ"));
		katanas.add(new Katana("鬼切丸","太刀","オニキリマル"));
		katanas.add(new Katana("和泉守兼定","打刀","イズミノカミカネサダ"));

//		for(Katana k : katanas) {
//			k.show();
//		}

		for(int i = 0 ; i < katanas.size() ; i++) {
			katanas.get(i).show();
		}

	}

}
