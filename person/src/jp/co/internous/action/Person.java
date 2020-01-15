package jp.co.internous.action;

public class Person {

//nullを入れておくことで変数の初期化となる
	public String name = null;
	public int age = 0;



//演習③
//変数を追加
	public String phoneNumber = null;
	public String address =null;



//演習⑤
//メソッドを追加
	public void talk() {
		System.out.println(this.name + "が話す");
	}
	public void walk() {
		System.out.println(this.name + "が歩く");
	}
	public void run() {
		System.out.println(this.name + "が走る");
	}
}
