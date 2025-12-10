package com.saki.java.chapter07.game.vl;

public class Magazine extends GameObject implements Buyable, Comparable<Magazine> {

  /**
	 * 
	 */
	private static final long serialVersionUID = -5923639990254621831L;
	
	/**
	 * 
	 */
private double price;

  public Magazine( String name, double price ) {
    super( name );
    this.price = price;
  }

  @Override public double price() {
    return price;
  }

  @Override public int compareTo( Magazine that ) {
    return Double.compare( this.price(), that.price() );
  }

  @Override public String toString() {
    return name + " " + price;
  }
}