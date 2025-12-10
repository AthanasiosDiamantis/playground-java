package com.saki.java.chapter07.oop;

public class BigBassLoudspeaker extends Loudspeaker {
	
	@Override
	BigBassLoudspeaker getThis() { // instead of "Loudspeaker getThis()"
		return this;
	}

}
