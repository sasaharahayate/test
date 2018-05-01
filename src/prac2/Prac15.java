package prac2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class CryptEncodeT{//暗号化用 (アウトプット)

	public void method1() {


		Scanner scn = new Scanner(System.in);
		System.out.print("文字データ :");
		String s = scn.nextLine();

		scn.close();

		File output = new File("C:\\output\\decode_crypt.txt");
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




//	File output = new File("C:\\output\\decode_origin.txt");
//
//	FileOutputStream out = new FileOutputStream(output);
//

}



public class Prac15 {

	public static void main(String[] args) {




		File input = new File("C:\\output\\decode_crypt.txt");
		FileInputStream in = null;
		try {
			in = new FileInputStream(input);

			int d ;
			while((d = in.read()) != -1) {

			}

//			for(int i = 0 ; i < s.length() ; i++) {
//				int c = s.charAt(i) +1 ;
//				out.write(c);
//			}


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
