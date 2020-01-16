package jp.co.internous.action;

public class Android extends SmartPhone {

	public static void main(String[] args) {
		SmartPhone Android = new SmartPhone();

		Android.play();
		Android.stop();
		Android.next();
		Android.back();
		Android.call();
		Android.mail();
		Android.photo();
		Android.internet();
	}
}
