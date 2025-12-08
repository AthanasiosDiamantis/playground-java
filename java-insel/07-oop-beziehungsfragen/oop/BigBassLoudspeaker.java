package com.JavaInsel.Chapter7.oop;

public class BigBassLoudspeaker extends Loudspeaker {
	
	@Override
	BigBassLoudspeaker getThis() { // instead of "Loudspeaker getThis()"
		return this;
	}

}
