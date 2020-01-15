package jp.co.internous.action;

import java.util.HashMap;
import java.util.Map;

class MapSample2 {
	public static void main(String[] args) {
		Map<String,Integer> testMap = new HashMap<>();

		testMap.put("Taro",30);
		testMap.put("Ichiko",60);
		testMap.put("Jiro",45);

//MapのkeySet()は、そのMapが持つkeyをset型で返してくる。
		for(String Key : testMap.keySet()) {
			System.out.println(testMap.get(Key));
		}
	}
}
