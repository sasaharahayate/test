package tsd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample11_6_2 {

	public static void main(String[] args) {
		File input = new File("C:\\ocjp\\ocjp_buf.txt");
		File output = new File("C:\\ocjp\\ocjp_co_py_buf.txt");

		BufferedReader in = null;
//		BufferedWriter out = null;
		PrintWriter ou = null;

		try {
			in = new BufferedReader(new FileReader(input));
//			out = new BufferedWriter(new FileWriter(output));
			ou = new PrintWriter(new FileWriter(output));

			String line ;
			while((line = in.readLine()) != null) {
//				out.write(line);
//				out.newLine();
				ou.println(line);
			}
			ou.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {

				if(in != null) {
					in.close();
				}
//				if(out != null) {
//					out.close();
//				}
				if(ou != null) {
					ou.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
