package com.saki.captainciao.chapter05;

import java.util.Scanner;

public class PasswordTester {

	public static void main(String[] args) {
		System.out.println(isGoodPassword("ghfnsenHefG5'_"));
		System.out.println(isGoodPassword("ghfnFnHefG5'_"));
		System.out.println(isGoodPassword("ghfn45efG5'_"));
		System.out.println(isGoodPassword("ghfnse-nHefG5'_"));
		System.out.println(isGoodPassword("ghfndef5'_"));
		System.out.println(isGoodPassword("111df1234"));
		System.out.println(isGoodPassword("ghfnsenHefG5'_"));
		System.out.println(isGoodPassword("ghf"));

		String answere = null;
		String pwd= null;
		Scanner sc = new Scanner(System.in);
		boolean wrongPWD = true;
		int counterTries = 0;

		while (wrongPWD && counterTries <= 5) {

			answere = counterTries < 1 ? "Pleas enter a PWD and hit Enter now: "
					: String.format("not high security standard, this was your %d try! please try again!!!",
							counterTries);
			counterTries += 1;

			System.out.println(answere);
			pwd = sc.nextLine();

			wrongPWD = !isGoodPassword(pwd);

		}

		System.out.println(String.format(
				"great, after %d tries you found a hight security pwd, bad news,%nyou where hacked, your PWD is: %s",
				counterTries, pwd));

	}

	public static boolean isGoodPassword(String inputPwd) {
		boolean result = false;
		boolean checkSmallLetters = false;
		boolean checkBigLetters = false;
		boolean checkIfNumbers = false;
		boolean checkIfSymbols = false;

		if (inputPwd.length() < 8) {
			System.err.println("Password too short");
			return false;
		}
		char[] pwdAsArry = inputPwd.toCharArray();

		for (int i = 0; i < inputPwd.length(); i++) {
			if (Character.isUpperCase(pwdAsArry[i])) {
				checkBigLetters = true;
			}
			if (Character.isLowerCase(pwdAsArry[i])) {
				checkSmallLetters = true;
			}
			if (Character.isDigit(pwdAsArry[i])) {
				checkIfNumbers = true;
			}
			if (!Character.isLetterOrDigit(pwdAsArry[i])) {
				checkIfSymbols = true;
			}
		}

		if (checkBigLetters && checkIfNumbers && checkIfSymbols && checkSmallLetters) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}
