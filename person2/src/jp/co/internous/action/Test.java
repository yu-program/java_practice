//Testクラスの生成
package jp.co.internous.action;

public class Test {

//演習①
//Personクラスをインスタンス化
	public static void main(String[] args) {
		Person taro = new Person();
//演習③
//コンストラクタ①を使ったインスタンス化(通常のインスタンス化)
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);

//コンストラクタ②を使ったインスタンス化(コンストラクタ①と比べてコードの分量を減らしてコーディングできる。)
		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);



//演習⑤
//コンストラクタ③使用
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

//コンストラクタ④使用
		Person n = new Person(25);
		System.out.println(n.name);
		System.out.println(n.age);

//コンストラクタ⑤使用
		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}
}
