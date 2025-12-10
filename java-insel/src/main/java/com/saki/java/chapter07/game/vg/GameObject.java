package com.saki.java.chapter07.game.vg;

public class GameObject {
	
	protected String name;
	
	public String getName() {
		return name;
	}
	
	public final void setName( String name) {
		if (name != null && name.isEmpty() ) {
			this.name = name;
		}
			
	}

}
