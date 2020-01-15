package jp.co.internous.action;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class MapSample3 {
	public static void main(String[] args) {
		Map<String,Integer> testMap = new HashMap<>();

		testMap.put("Taro",30);
		testMap.put("Ichiko",60);
		testMap.put("Jiro",45);

//MapのKeyとValueどちらも取得して、表示する。エントリーされている要素(KeyとValueがセット)をentrySet()で
//返す。(KeyとValueを)
		for( Entry<String,Integer> entry : testMap.entrySet()) {
//getKey()でKeyを取得、getValue()でValueを取得する2つのメソッドを使う。
//HashMapは順序を保証しないので追加要素を追加した順にならない。
//順序を保証したいのなら、LinkedHashMap、Keyで自動的にsortするならTreeMapを使用する。
			System.out.println(entry.getKey() + "の点数は" + entry.getValue());
		}
	}
}
