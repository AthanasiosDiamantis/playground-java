package com.saki.java.chapter07.game.vf;

public class Room extends GameObject {

	public int size;

	@Override
	public String toString() {
		return super.toString() + " [ size = " + size + " ]"; // with super.toString this method inherits the
		// functionality of parent-class-method, but adds new size-attribute and overrides the old method
	}

}
