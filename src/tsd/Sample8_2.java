package tsd;

public class Sample8_2 {

	public static void main(String[] args) {
		String ext = "From external class";

		MyTopLevelS.gateToStatic();
		MyTopLevelS.StaticNested sn = new MyTopLevelS.StaticNested();
		sn.accessStaticNasted(ext);
	}

}

class MyTopLevelS{//外部クラス
	private static String top = "From top lebel class";

	public static void gateToStatic() {//外部クラスのメソッド
		StaticNested s = new StaticNested();
		s.accessStaticNasted(top);
	}

	static class StaticNested{//static ネストクラス
		public void accessStaticNasted(String st) {
			System.out.println(st);
		}
	}
}
