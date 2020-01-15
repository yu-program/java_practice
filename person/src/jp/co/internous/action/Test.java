package jp.co.internous.action;

public class Test {

	public static void main(String[] args) {
//演習①
//左辺のPersonは型(個人で定義したPerson.javaのこと。)でnewしたPersonを変数taroに代入している。
		Person taro = new Person();
		taro.name ="山田太郎";
		taro.age = 20;

		System.out.println(taro.name);
		System.out.println(taro.age);



//演習②
//木村次郎さん、18才をインスタンス化する。
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;

		System.out.println(jiro.name);
		System.out.println(jiro.age);

//鈴木花子さん、16才をインスタンス化する。
		Person suzuki = new Person();
		suzuki.name = "鈴木花子";
		suzuki.age = 16;

		System.out.println(suzuki.name);
		System.out.println(suzuki.age);

//山川由美子、25才をインスタンス化する。
		Person yamakawa = new Person();
		yamakawa.name = "山川由美子";
		yamakawa.age = 25;

		System.out.println(yamakawa.name);
		System.out.println(yamakawa.age);



//演習④
//田中博さん、20才、090-1234-5678、東京都をインスタンス化する。
		Person tanaka = new Person();
		tanaka.name = "田中博";
		tanaka.age = 20;
		tanaka.phoneNumber = "090-1234-5678";
		tanaka.address = "東京都";

		System.out.println(tanaka.name);
		System.out.println(tanaka.age);
		System.out.println(tanaka.phoneNumber);
		System.out.println(tanaka.address);



//演習⑥
//talk(),walk(),run()を呼び出す。
		taro.talk();
		tanaka.walk();
		tanaka.run();


//演習⑧
//Robutクラスをインスタンス化して、talk(),walk(),run()を呼び出す。
		Robot aibo = new Robot();
		aibo.name ="aibo";

		aibo.talk();
		aibo.walk();
		aibo.run();


		Robot asimo = new Robot();
		asimo.name ="asimo";

		asimo.talk();
		asimo.walk();
		asimo.run();


		Robot pepper = new Robot();
		pepper.name ="pepper";

		pepper.talk();
		pepper.walk();
		pepper.run();
	}
}
