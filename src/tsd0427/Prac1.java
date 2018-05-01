package tsd0427;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Prac1 {

	public static void main(String[] args) {
		File input = new File("C:\\ocjp\\tst.txt");
		File output = new File("C:\\ocjp\\tst_copy.txt");
		BufferedReader in = null;
		PrintWriter out = null;

		try {
			in = new BufferedReader(new FileReader(input));
			out = new PrintWriter(new FileWriter(output));

			String line;
			while((line = in.readLine()) != null) {
				out.println(line);
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
