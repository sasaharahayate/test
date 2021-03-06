package tsd;

public class Sample8_1 {

	public static void main(String[] args) {
		String ext = "From external class";

		//外部クラスのインスタンス化
		MyTopLevel mt = new MyTopLevel();
		//外部クラスのメソッド呼び出し
		mt.createNested();
		//外部クラスが持つネストクラスのインスタンス化
		MyTopLevel.MyInner inner = mt.new MyInner();
		//ネストクラスのメソッド呼び出し
		inner.accessInner(ext);

	}

}

class MyTopLevel{//外部クラス
	private String top = "From Top Level class";
	MyInner minn = new MyInner();

	public void createNested() {//外部クラスのメソッド
		minn.accessInner(top);
	}

	class MyInner{//ネストクラス
		public void accessInner(String st) {//ネストクラスのメソッド
			System.out.println(st);
		}
	}
}
