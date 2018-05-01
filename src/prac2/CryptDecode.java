package prac2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CryptDecode {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("ファイル名 :");
		String filename = scn.nextLine();

		scn.close();

		File input = new File("C:\\output",filename);
		FileInputStream in = null;
		try {
			in = new FileInputStream(input);

			int c ;
			while((c = in.read()) != -1) {
//				char d = (char)(c-1);
//				System.out.print(d);
				System.out.print((char)(c-1)); //まとめて記述
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}

	}

}
