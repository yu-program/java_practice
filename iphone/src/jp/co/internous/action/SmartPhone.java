package jp.co.internous.action;

//演習②
//継承する。このSmartPhoneクラスは、Mp3Playerクラスを継承しているサブクラス(=子クラス)である。
//public class B extends A{}→BはAのサブクラス。AはBのスーパークラス。
public class SmartPhone extends Mp3Player{
	//演習④
	//スーパークラスの機能をサブクラスで上書くことができる。(=オーバーライドという)
	// →この場合は、スーパークラスであるMp3Playerクラスの機能は、無視され、SmartPhoneクラスで
	//定義された機能が実行される。
	public void play() {
		System.out.println("再生(ハイレゾ機能)");
	}
	public void stop() {
		System.out.println("停止(ハイレゾ機能)");
	}
	public void next() {
		System.out.println("次へ(ハイレゾ機能)");
	}
	public void back() {
		System.out.println("戻る(ハイレゾ機能)");
	}



	public void call() {
		System.out.println("電話");
	}
	public void mail() {
		System.out.println("メール");
	}
	public void photo() {
		System.out.println("写真");
	}
	public void internet() {
		System.out.println("インターネット");
	}
}
