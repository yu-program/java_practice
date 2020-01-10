package jp.co.internous.action;

public class Human {

	public static void main(String[] arg) {



//		HumanクラスとHumanNameクラスを連動させる
//		変数abcの中にHumanNameクラスのコピー(newする＝インスタンスする)が代入されるということ
		HumanName abc = new HumanName();
//		変数abc(中身はHumanNameクラス)のgetNameメソッド(publicだから別クラスで利用できる)を呼び出す。
		System.out.println(abc.getName());

//		HumanクラスとHumanAgeクラスを連動させる
		HumanAge def = new HumanAge();
//		変数def(中身はHumanAgeクラス)のgetAgeメソッド(publicだから別クラスで利用できる)を呼び出す。
		System.out.println(def.getAge());

		HumanAddress ghi = new HumanAddress();
		System.out.println(ghi.getAddress());
	}
}
