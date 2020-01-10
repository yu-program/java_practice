package jp.co.internous.action;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(menseki(2));
		System.out.println(kakezan(4,5));
		System.out.println(hikizan(40,30));
	}

	public static double menseki(int hankei) {
		return hankei*hankei*3.14;
	}

	public static int hikizan(int num1,int num2) {
		return num1 - num2;
	}

	public static int kakezan(int num1,int num2) {
		return num1*num2;
	}
	}
