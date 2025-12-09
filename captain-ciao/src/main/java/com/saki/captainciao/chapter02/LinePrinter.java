package com.saki.captainciao.chapter02;

public class LinePrinter {

	public static void line() {
		for (int i = 0; i<10 ; i++) {
				String apple = "";
				//String heart = "";
			System.out.print(apple);
		}
		System.out.println();
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
