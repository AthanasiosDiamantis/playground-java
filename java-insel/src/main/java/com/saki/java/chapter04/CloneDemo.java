package com.saki.java.chapter04;

import java.awt.Point;

public class CloneDemo {

	public static void main(String[] args) {
		int[] sourceArray = new int[7];
		sourceArray[0] = 4711;
		int[] targetArray = sourceArray.clone();
		System.out.println("Length of the target array: " 
		+ targetArray.length);
		System.out.println("Containment of the array at row[0]" + targetArray[0]);

		Point[] pointArray1 = { new Point(1,2), new Point(2,3)};
		Point[] pointArray2 = pointArray1.clone();
		
		System.out.println( pointArray1[0] == pointArray2[0]);
		System.out.println(pointArray1[0]);
		System.out.println(pointArray1[1]);
		
		int[] f = {3,4,5,6,7,8};
		for (int printF: f)
			System.out.print(printF + " ");
		System.arraycopy(f, 1, f, 0, f.length - 1); // links
		System.out.println();
		for (int printF: f)
			System.out.print(printF + " ");
		System.arraycopy(f, 0, f, 1, f.length - 1); // rechts
		System.out.println();
		for (int printF: f) 
			System.out.print(printF + " ");
		System.out.println();
		int[] g = new int[6];
		
		System.arraycopy(f, 2, g, 0, 4);
		for (int printG: g) {
			System.out.print(printG);
		}
		System.out.println("\n***************************\n");
		
		String[] faecher = new String[7];
		faecher[0] = "Mathe";
		faecher[1] = "Deutsch";
		faecher[2] = "Englisch";
		faecher[3] = "Bio";
		faecher[4] = "Physik";
		
		for ( int i = 0; i < faecher.length; i++) {
			System.out.println(faecher[i]);
		}
		
		String[] faecher2 = new String[7];
		System.out.print("Sitiation NULL: ");
		for(String printF2: faecher2) {
			System.out.println(printF2);
		}

		
		System.arraycopy(faecher, 0, faecher2, 0, faecher.length);
		System.out.print("Sitiation Voll: ");
		for(String printF2: faecher2) {
			System.out.println(printF2);
		}

		// Endlosschleife
//		for (int i = 0; i >= 0; i++) {
//			System.out.println(faecher[6]);
//		}
		

		
	}

}
