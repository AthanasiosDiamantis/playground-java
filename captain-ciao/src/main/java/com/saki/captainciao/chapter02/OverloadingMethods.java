package com.saki.captainciao.chapter02;

public class OverloadingMethods {

	public static void main(String[] args) {
		LinePrinter.line(9);
		System.out.println();
		line(5);
		System.out.println();
		LinePrinter.line(15,'k');
		line(7,'z');
		System.out.println();
		LinePrinter.line("<za",10,'-',"az>");
		// TODO Auto-generated method stub

	}
	public static void line(int len) {
		line(len,'-');
	}

	public static void line(int len, char c) {
		// this implementation is from Ullenboom
		while (len-- > 0) {
			System.out.print(c);
		}
		/*this was my idea and did the same
		 * for (int i= 0; i < len; i++ ) {
			System.out.print(c);
		}
		*/
	}
	public static void line(String prefix,int len, char c,String suffix) {
		System.out.print(prefix);
		line(len,c);
		System.out.print(suffix);
	}

}
