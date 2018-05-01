package Plac;

import java.util.ArrayList;

class Game{
	String name; //ゲーム名
	String type; //ジャンル
	int sale; //販売本数

	Game(String l ,String m ,int n) {
		name = l;
		type = m;
		sale = n;
	}

	void show(){
		System.out.println("ゲーム名 : " + name + ",ジャンル : " + type + ",販売本数 : " + sale);
	}
}

public class MainGames {


	public static void main(String[] args) {
		ArrayList<Game> games = new ArrayList<>();

//		Game [] games = {	new Game("スプラトゥーン2","アクションシューティング",712),
//							new Game("モンスターハンター","アクションロールプレイングゲーム",936),
//							new Game("ドラゴンクエストXI","ロールプレイングゲーム",317)};

//		}


		games.add(new Game("スプラトゥーン2","アクションシューティング",712));
		games.add(new Game("モンスターハンター","アクションロールプレイングゲーム",936));
		games.add(new Game("ドラゴンクエストXI","ロールプレイングゲーム",317));

		for(Game g : games) {
			g.show();
		}


	}

}
