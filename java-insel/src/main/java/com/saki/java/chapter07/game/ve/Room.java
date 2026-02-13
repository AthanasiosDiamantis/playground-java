package com.saki.java.chapter07.game.ve;

public class Room extends GameObject {
	public int size;

	// old version of toString override
//	@Override
//	public String toString() {
//		return String.format("%s[name = %s, size = %d]", getClass().getSimpleName(), name, size);
//	}

	@Override
	public String toString() {
		return super.toString() + "[ size=" + size + " ]";

	}

}
