package com.saki.java.chapter07.game.vl;

import java.io.Serializable;

public abstract class GameObject implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
protected String name;
  
  protected GameObject( String name ) {
    this.name = name;
  }
}
