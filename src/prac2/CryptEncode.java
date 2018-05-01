package prac2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CryptEncode {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("ファイル名 :");
		String filename = scn.nextLine();
		System.out.print("文字データ :");
		String s = scn.nextLine();


		scn.close();

		File output = new File("C:\\output",filename);
		FileOutputStream out = null;

		try {
			out = new FileOutputStream(output);

			for(int i = 0 ; i < s.length() ; i++) {
				int c = s.charAt(i) +1 ;
				out.write(c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) {
					out.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
