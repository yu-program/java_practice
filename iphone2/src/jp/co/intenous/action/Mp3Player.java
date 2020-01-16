package jp.co.intenous.action;

public interface Mp3Player {
//演習①
//interfaceは処理ではなく、ルールを記述していくイメージ。実装はクラスで行う。
//abstract(抽象メソッドの際に必ず記載)はinterfaceとセットで使用する。
//メソッド名だけ記述。メソッド名のみで処理内容を記述しないメソッドを"抽象メソッド"いう。
	public abstract void play();
	public abstract void stop();
	public abstract void next();
	public abstract void back();
}
