package tsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample11_3 {

	public static void main(String[] args) {
		//ファイルをコピー
		File inputFile = new File("C:\\ocjp\\data.txt");
		File outputFile = new File("C:\\ocjp\\datacopy.txt");

		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(inputFile);//FileNotException
			out = new FileOutputStream(outputFile);

			int c;
			while((c = in.read()) != -1) { //ファイルの終端ではない限り
				out.write(c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}finally {
			try {
				if(in != null) {
					in.close();//NullPointerException
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
