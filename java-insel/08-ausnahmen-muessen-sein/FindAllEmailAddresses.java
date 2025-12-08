package com.JavaInsel.Chapter8.Exceptions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FindAllEmailAddresses {

	public static void main(String[] args) {
		printAllEmailAdresses( "https://www.rheinwerk-verlag.de/hilfe/service-und-kontakt_8");

	}
	
	static void printAllEmailAdresses (String urlString) {
		try {
			URL url = new URL( urlString);
			Scanner sc = new Scanner (url.openStream() );
			Pattern pt = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
			for (String email; (email = sc.findWithinHorizon( pt, 0)) != null; )
				System.out.println(email);
		}
		catch (MalformedURLException e) {
			System.err.println( "wrrrrrrrong URL!");
			
		}
		catch (IOException e) {
			System.err.println(" could NOT open URL!");
		}
	}

}
