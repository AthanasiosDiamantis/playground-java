package com.JavaInsel.Chapter7.game.vf;

/**
 * 
 */
public class GameObject {
	
	public String name;
	
	@Override
	public String toString() {
		return String.format("%s [ name = %s ] ", getClass().getSimpleName(), name);
	}
	
}
