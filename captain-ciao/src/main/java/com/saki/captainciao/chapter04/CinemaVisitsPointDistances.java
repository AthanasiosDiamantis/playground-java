package com.saki.captainciao.chapter04;

import java.awt.Point;

public class CinemaVisitsPointDistances {
	
	public static void main(String[] args) {
		
		// TODO check null Pointer Exception add throw Exception
		Point[] points = { new Point(10,20),new Point(12,2),new Point(44,4),};
		
		for (Point point : points) {
			System.out.println(point + " distance zo zero point: " + round2Digits(point.distance(0,0)) );
		}
		System.out.println();
		System.out.println(minDistance(points, points.length));
		System.out.println("And the winner is: "+minDistancePoint(points, points.length));
	}
	
	public static double minDistance(Point[] points, int size) {
		
		if (points.length == 0 || size >points.length ) {
			throw new IllegalArgumentException(
					"Array is either empty or size out of bounds");
		}
		Point zeroPoint = new Point(0,0);
		double result =0.0;
		
		for (int i = 0; i < size-1; i++) {
			result = Math.min(
					points[i].distance(zeroPoint), 
					points[i+1].distance(zeroPoint));
		}		

		return round2Digits(result);
	}
	
	public static Point minDistancePoint(Point[] points, int size) {
		Point zeroPoint = new Point(0,0);
		Point closerPoint = new Point();
		
		for (int i = 0; i < size-1; i++) {
			closerPoint = points[i];
			if (closerPoint.distance(zeroPoint) > points[i+1].distance(zeroPoint) ) {
				closerPoint = points[i+1];
			}
		}

		return closerPoint;
	}

	
	public static double round2Digits(double input) {
		int newNumber100 = (int) Math.round(input*100);
		return ((double) newNumber100) /100;
		
	}

}
