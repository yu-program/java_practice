//演習② Mp3Playerインターフェースの実装のため、処理内容を記述。
package jp.co.intenous.action;

//public class SmartPhone implements Mp3Player {

//演習⑥ 継承(extends)+inrterface(ポリモーフィズム)
	public class SmartPhone extends Phone implements Mp3Player,NewFunction {

//Mp3Playerインターフェースで記述した抽象メソッドの処理内容を記載する。
//スーパークラスであるPhoneクラスで処理内容を定義しているので以下はなくてもよい。

	public void play() {
		System.out.println("再生(ハイレゾ)");
	}
	public void stop() {
		System.out.println("停止");
	}
	public void next() {
		System.out.println("次へ");
	}
	public void back() {
		System.out.println("戻る");
	}
}
