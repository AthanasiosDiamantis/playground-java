package com.saki.captainciao.chapter02;

public class Collatz {

	public static void main(String[] args) {
		collatz(23);
		System.out.println("\n************************\n");
		System.out.println(collatzMax(23) );

	}

	static long collatz(long n) {
		while (n > 1) {
			// check even number
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			System.out.println(n);
		}
		return n;
	}

	static long collatzMax(long n) {
		long max = n;
		while (n >1) {
			if (n % 2 == 0) {
				n /=2;
			}
			else {
				n = 3*n+1;
				if (n > max) {
					max = n;
				}
			}
		}
		return max;
	}

}
