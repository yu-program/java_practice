//演習③ IphoneクラスでSmartPhoneのインスタンスを生成する
package jp.co.internous.action;

public class Iphone extends SmartPhone{

	public static void main(String[] args) {
		SmartPhone iphone = new SmartPhone();
//インスタンスしたクラスのメソッドを継承する。メソッドを呼び出している。
		iphone.play();
		iphone.stop();
		iphone.back();
		iphone.next();
		iphone.call();
		iphone.mail();
		iphone.internet();
		iphone.photo();

	}
}
