package jp.co.internous.action;

import 	java.util.HashSet;
import java.util.Set;

class SetSample {
//SetはListに似ているが重複した値を持つことはできない。Listは重複していても値を持つことができる。
	public static void main (String[] args) {
//最初の<>でどんな型のsetなのかを定義。
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);

		for(int n:set) {
			System.out.println(n);
		}
	}
}
