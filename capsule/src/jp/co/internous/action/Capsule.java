package jp.co.internous.action;

public class Capsule {

//演習②
	public static void main(String[] args) {
		Person taro = new Person("山田太郎",20);
//		System.out.println(taro.name);
//		 →Personクラスで、nameはprivateのためアクセス制限がかかり、Capsuleクラスから
//		中身を見ることができない。なので、中身を見たい場合は、publicになっているgetNameを使用する。
		System.out.println(taro.getName());
//演習③ Capsuleプロジェクトを実行



//演習⑤
//getterを使用して、年齢を取得する。
		System.out.println(taro.getAge());
//setterを使って年齢を30歳に登録する。
		taro.setAge(30);
		System.out.println(taro.getAge());
	}
}
