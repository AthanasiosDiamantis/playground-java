package com.saki.javainsel15.chapter07.oop;

public class BigBassLoudspeaker extends Loudspeaker {
	
	@Override
	BigBassLoudspeaker getThis() { // instead of "Loudspeaker getThis()"
		return this;
	}

}
