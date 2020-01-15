package jp.co.internous.action;

import java.util.Arrays;
import java.util.List;

//既存の配列からlistを生成し、値を追加し、ループ処理で中身を表示する。
class ListSample2 {
//static finalで配列の場合は、大文字にする
	static final String[] WEEK = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	public static void main(String[] args) {
//asListで既存の配列をListにする。
		List<String> week = Arrays.asList(WEEK);

//foreachでもループ処理できる。下記は拡張forループ文という。
		for(String day :week) {
			System.out.println(day);
		}
	}
}
