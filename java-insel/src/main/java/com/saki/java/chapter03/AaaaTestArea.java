package com.saki.java.chapter03;

import java.awt.Point;

public class AaaaTestArea {

	public static void main(String[] args) {
		// test if one Object has to reference variables
		Point p = new Point();
		Point t = p;
		p.x = 5;
		
		System.out.println(p);
		
		t.y = 3;
		
		System.out.println("t ->> " + t + "\n" + "p ->> "+p);

	}

}
