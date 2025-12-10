package com.saki.java.chapter08;

public class ContinueInput {

	public static void main(String[] args) {
		int number = 0;
		while (true) {
			try {
				String s = javax.swing.JOptionPane.showInputDialog("Pleas enter a number");
				number = Integer.parseInt(s);
				break;
			} 
			catch (NumberFormatException e) {
				System.err.println("Das war keine Zahl!");
			}
		}
		System.out.printf("thanx for your number %d ", number);
		System.exit(0);
		// TODO Auto-generated method stub

	}

}
