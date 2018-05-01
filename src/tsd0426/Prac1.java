package tsd0426;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Prac1 {

	public static void main(String[] args) {
		File input = new File("c:\\ocjp\\ocjp.txt");
		File output = new File("C:\\ocjp\\ocjpcopy.txt");

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(input);
			out = new FileOutputStream(output);

			int c;
			while((c = in.read()) != -1) {
				out.write(c);
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
				if(out != null) {
					out.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}



	}

}
