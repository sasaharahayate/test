package prac2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Prac16 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("C:\\ocjp\\data.txt");

		BufferedReader in;
		ArrayList<String> news = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		int cnt = 0;

		try {
			in = new BufferedReader(new FileReader(input));

			//ArrayListにデータを格納
			String line;
			while((line = in.readLine()) != null) {
				news.add(line);
			}

			System.out.println("タイピングゲームを開始します。");
			System.out.println("何かキーを入力してください :");
			String st = scn.nextLine();

			LocalTime start = LocalTime.now();

			//タイピング
			for(int i = 0 ; i < 5 ; i++) {
				String str;

				System.out.println("**************** 第" + (i + 1) +"問 ****************");

				//ランダムに問題を選択
				int rand = new Random().nextInt(news.size());
	        	String s = news.get(rand);
	        	//2行で表示
	    		String[] spl = s.split(",");
	            for (String t : spl) {
	                System.out.println(t);
	            }

	    		//正解するまでループ
				do {
					System.out.println("【入力してください】");
	    			str = scn.nextLine();
	    		}while(!(str.equals(spl[1])) );

				//文字数を加算
				cnt += str.length();

				//正解した問題を消去
	            news.remove(rand);
	        }
			LocalTime fin = LocalTime.now();
			System.out.println("**************************************");
			System.out.println("終了しました。おつかれさまでした。");

			long time = start.until(fin, ChronoUnit.SECONDS);
			double strsecond = (double)cnt / (double)time ;

			System.out.println("**************** 成績 ****************");
			System.out.println("  時間      ：" + time + "秒");
			System.out.println("  文字数    ：" + cnt + "文字");
			System.out.println("  1秒あたり ：" + String.format("%.1f", strsecond) + "文字");
			System.out.println("**************************************");

			scn.close();


		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			throw new FileNotFoundException("データがみつかりません");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
		//ランダムにデータを取り出す
		int rand = new Random().nextInt(news.size());
		System.out.println(news.get(rand));

		//2行に分ける
		String s = news.get(rand);
		String[] spl = s.split(",");

        for (String t : spl) {
            System.out.println(t);
        }

		//5連続
		for(int i = 0 ; i < 5 ; i++) {
			int rand = new Random().nextInt(news.size());
        	String s = news.get(rand);
    		String[] spl = s.split(",");
            for (String t : spl) {
                System.out.println(t);
            }
            news.remove(rand);
		}

  	//5問連続(重複なし)
		Collections.shuffle(news);
        for(int i = 0 ; i < 5 ; i++) {
        	String s = news.get(i);
    		String[] spl = s.split(",");
            for (String t : spl) {
                System.out.println(t);
            }
        }

		//入力が正しいか
		String s = news.get(2);
		String[] spl = s.split(",");
		for (String t : spl) {
            System.out.println(t);
        }

		Scanner scn = new Scanner(System.in);
		System.out.print("【入力してください】");

		String str = "tst";
		do {
			str = scn.nextLine();
		}while(!(str.equals(spl[1])) );

*/


