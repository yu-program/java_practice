package jp.co.intenous.action;

public class Iphone {
//演習③ SmartPhoneをインスタンスする。

	public static void main(String[] args) {
		SmartPhone iphone = new SmartPhone();
		iphone.play();
		iphone.stop();
		iphone.next();
		iphone.back();
		iphone.call();
		iphone.mail();
		iphone.photo();
		iphone.internet();
	}
}
