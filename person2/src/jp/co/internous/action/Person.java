//Personクラスの生成
package jp.co.internous.action;

public class Person {

//演習①
//メンバ変数の初期化
	public String name = null;
	public int age = 0;

//演習②
//コンストラクタ①、②の追加

//コンストラクタ①=デフォルトコンストラクタ(Testクラスのインスタンス化に紐づいている。
//他の型のコンストラクタを使用しない場合は記述する必要がない。)
	public Person() {}

//コンストラクタ②
	public 	Person(String name,int age) {
//thisはPersonクラスのインスタンスしたクラスのメンバ変数ということ。Testクラスでは、taroやjiroのこと。
		this.name = name;
		this.age = age;
	}



//演習④
//引数の型や数、順序が異なるだけで複数のコンストラクタを生成することができる。
//このような多重定義をオーバーロードという。

//コンストラクタ③
	public Person(String name) {
		this.name = name;
		this.age = 0;
	}
//コンストラクタ④
	public Person(int age) {
		this.name = "名前なし";
		this.age = age;
	}
//コンストラクタ⑤
	public Person(int age,String name) {
		this.name = name;
		this.age = age;
	}
}
