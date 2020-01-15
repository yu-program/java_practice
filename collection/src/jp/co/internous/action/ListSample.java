package jp.co.internous.action;

import java.util.ArrayList;
import java.util.List;

class ListSample {

	public static void main(String[] args) {
//		Listをインスタンスする(Arraylistの後ろの<>は省略可能)
		List <String> users = new ArrayList<String>();

//		add()メソッドで要素(値)を追加する
		users.add("Taro");
		users.add("Ichiko");
		users.add("Jiro");

//		get()メソッドで要素を取得する。配列と同様でindex(添え字)で取得する。
		String user1 = users.get(0);
		String user2 = users.get(1);
		String user3 = users.get(2);

//		consoleに表示
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
	}
}
