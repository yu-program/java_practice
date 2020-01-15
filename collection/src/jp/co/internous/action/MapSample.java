package jp.co.internous.action;

import java.util.HashMap;
import java.util.Map;

class MapSample {
//Mapは1要素にkeyとValueを持つ。List,Setとよく似ているが、要素の追加方法や
	public static void main(String[] args) {
//最初の<>のStringはKeyの型、IntegerはValueの型。newの<>は省略可能。
		Map<String,Integer> testMap = new HashMap<>();
//ListやSetのように、addメソッドではなく、putメソッドを使う。keyがTaroでValueが30という1要素を追加する。
		testMap.put("Taro",30);
//要素の取得はgetメソッドで取得する。ListやSetと同じ。ただし、MapはindexではなくKeyで取得する。
		int point = testMap.get("Taro");
		System.out.println(point);
	}
}
