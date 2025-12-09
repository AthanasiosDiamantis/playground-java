package com.saki.captainciao.chapter02;
/**
 *
 * @author saki
 * @version 0.1.0
 * @date 02nd of December 2022
 * From Captain CiaoCiao
 * Chapter 2
 */
public class RightTriangle {

	public static boolean isRightTriangle( double x, double y, double z ){
		// my implementation
		double a2 = Math.pow(x,2);
		double b2 = Math.pow(y,2);
		double c2 = Math.pow(z,2);
		if (a2 == (b2 +c2) ) {
			return true;
		}
		else if (b2 == (a2 +c2) ) {
			return true;
		}
		else if (c2 == (a2 +b2) ) {
			return true;
		}
		else {
			return false;
		}
	}

}
