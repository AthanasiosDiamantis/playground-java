package com.JavaInsel.Chapter6.Zeichenketten;

import java.time.LocalTime;

public class ConcatTimeToString {
	public static void main(String[] args) {
		String s1 = "the current time is: ";
		String s2 = LocalTime.now().toString();
		String s3 = s1.concat(s2);
		
		System.out.println(s3);
	}

}
