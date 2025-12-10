package com.saki.java.chapter08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadGifSizeCatchingExceptions {

	public static void main(String[] args) {
		RandomAccessFile f = null;
		try {
			f = new RandomAccessFile( "duke.git", "r");
			f.seek(6);
			
			System.out.printf(" %s x %s Pixel%n", f.read() + f.read() * 256,
					f.read() + f.read() * 256 );
		}
		catch( FileNotFoundException e) {
			System.err.println( "Datei nicht vorhanden" );
			
		}
		catch (IOException e) {
			System.err.println( "Allgemiener Ein-/Ausgabefehler!");
		}
		finally {
			if ( f != null ) 
				try { f.close(); } catch (IOException e) { }
		}
	}

}
