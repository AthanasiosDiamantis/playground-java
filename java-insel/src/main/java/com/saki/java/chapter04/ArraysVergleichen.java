package com.saki.java.chapter04;

import java.util.Arrays;

public class ArraysVergleichen {

	public static void main(String[] args) {
		Object[] array1 = { "Anne Bonny", "Fortune", "Sir Francis Drake", new int[] { 1, 2, 3 } };
		Object[] array2 = { "Anne Bonny", "Fortune", "Sir Francis Drake", new int[] { 1, 2, 3 } };

		System.out.println(array1.toString());
		System.out.println(array2.toString());
		System.out.println(array1 == array2);
		System.out.println(array1.equals(array2));
		System.out.println(Arrays.equals(array1, array2));
		System.out.println(Arrays.deepEquals(array1, array2));
	}

}
