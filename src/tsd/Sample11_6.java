package tsd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample11_6 {

	public static void main(String[] args) {
		File inputFile = new File("C:\\ocjp\\ocjp_buf.txt");
		File outputFile = new File("C:\\ocjp\\ocjpcopy_buf.txt");

		BufferedReader in = null;
		BufferedWriter out = null;

		try {
			//高レベルストリームなので()内に低レベルストリームを入れる
			in = new BufferedReader(new FileReader(inputFile));
			out = new BufferedWriter(new FileWriter(outputFile));

			String line;
			while((line = in.readLine()) != null) {//nullで判定
				out.write(line);
				out.newLine();//改行
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
