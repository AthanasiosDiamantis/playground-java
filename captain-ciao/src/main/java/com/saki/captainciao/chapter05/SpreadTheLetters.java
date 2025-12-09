package com.saki.captainciao.chapter05;

public class SpreadTheLetters {

	public static void main(String[] args) {
		System.out.println(mix("We're out of rum!", "-"));
		System.out.println(mix("Blimey", "👻"));
		System.out.println(mix("👻", "👻"));

	}

	public static String mix(String inputWord, String spreadSign) {
		String result = "";

		if (inputWord != null && spreadSign != null)
			for (int i = 0; i < inputWord.length(); i++) {
				result += inputWord.substring(i, i + 1) + (i < inputWord.length()-1 ? spreadSign : "");
			}

		return result;

	}

}
