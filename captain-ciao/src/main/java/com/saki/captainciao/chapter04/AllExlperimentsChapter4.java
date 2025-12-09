package com.saki.captainciao.chapter04;

public class AllExlperimentsChapter4 {

	public static void main(String[] args) {

		/* 1 */ String[] strings1 = new String[100];
		/* 2 */ Object[] a1 = (String[])strings1;
		/* 3 */ Object[] a2 = strings1;
		/* 4 */ Object[] strings2 = new String[] {"1", "2", "3",};
		/* 5 */ String[] a3 = (String[]) strings2;
		/* 6 */ String[] strings3 = {"4", "5", "6" };
		/* 7 */ Object[] a4 = strings3;
		/* 8 Object[] strings4 = {"1", "2", "3"}; */ 
		/* 9  String[] a5 = (String[]) strings4; */
		
		/* A */ int[] ints1 = new int[100];
		/* B  Object[] a6 = (int[]) ints1;
		/* C  Object[] ints2 = new int[100];
		/* D  int[] a7 = (int[]) ints2;
		*/
	}

}
