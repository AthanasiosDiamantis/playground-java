package com.JavaInsel.WriteSomeTestCode;

public class GreenGrasLand {

	public static void main(String[] args) {

		String s = javax.swing.JOptionPane.showInputDialog("Eingabe");
		if ( s != null && !s.isEmpty() ) {
			System.out.println("Eingabe erfolgt mit dem Text --> " + s);
		}
		else {
			System.out.println("Abbruch oder keine Eingabe! ");
		}
	}
}
