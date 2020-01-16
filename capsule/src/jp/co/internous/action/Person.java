//演習①
package jp.co.internous.action;

public class Person {

	private String name = null;
	private int age = 0;

//コンストラクタの宣言
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
//getterの作成(getの後ろの一文字目は必ず大文字。また必ずreturnで返す。メンバ変数(フィールド値)を取得する。)
	public String getName() {
		return this.name;
	}
//setterの作成(setの後ろも必ず一文字目は大文字。setNameでnameを書き換える処理をするだけで
//returnで返さないので（戻り値不要）void。)
	public void setName(String name) {
		this.name = name;
	}



//演習⑤
//getterを使用して、年齢を取得する。
	public int getAge() {
		return this.age;
	}

//setterを使って年齢を30歳に登録する。
	public void setAge(int age) {
		this.age = age;
	}
}
