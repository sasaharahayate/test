package tsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal01 {
	Animal01(){
		System.out.println("Animal()");
	}
}

class Dog01 extends Animal01 implements Serializable{
	Dog01(){
		System.out.println("Dog()");
	}
}

class Bulldog extends Dog01{

}



public class Sample11_7 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Bulldog obj = new Bulldog();

		try {
			fos = new FileOutputStream(new File("dog.txt"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj); //シリアライズ
			System.out.println("シリアライズ完了");

			fis = new FileInputStream(new File("dog.txt"));
			ois = new ObjectInputStream(fis);
			Bulldog readObj = (Bulldog) ois.readObject();

			System.out.println("デシリアライズ完了");

		}catch(ClassNotFoundException e) {
			System.out.println("クラスファイルがありません");
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありません");
		} catch (IOException e) {
			System.out.println("IOError");
		}finally {
			try {
				oos.close();
				ois.close();
			}catch(IOException e) {

			}
		}

	}

}
