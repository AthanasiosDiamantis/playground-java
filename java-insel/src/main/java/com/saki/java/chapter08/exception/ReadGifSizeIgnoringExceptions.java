package com.saki.java.chapter08.exception;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.FileSystemNotFoundException;

public class ReadGifSizeIgnoringExceptions {

	public static void main(String[] args) 
			throws FileSystemNotFoundException, IOException {
		RandomAccessFile f = new RandomAccessFile( "duke.gif", "r" );
		f.seek(6);
		
		System.out.printf("%s x %s Pixel%n",f.read() + f.read() * 256,
				f.read() + f.read() * 256);
		f.close();
	}

}
