package com.saki.captainciao.chapter04;

public class DrawMountains {

	public static void main(String[] args) {
		int[] altitudes = {0,1,1,2,2,3,3,3,4,5,4,3,2,2,1,0};
		int[] altidudes2 = {7,7,6,5,5,5,4,4,4,3,3,2,1,1,2,2,3,3,3,4,4,4,5,6,7,6,7,7,7,8,8,9,8,7,7,6,5,4,3,2,1,1,1,1};

//		printMountain(altitudes);
		printMountain(altidudes2);
		

	}
	
	static void printMountain(int[] altitudes){
		int maxHight = altitudes[0];
		
		for(int i = 1; i < altitudes.length; i++) {
			maxHight = Math.max(maxHight, altitudes[i]);
		}
		int counterHight = maxHight;
		for (int hight = 0; hight <= counterHight; hight++) {
			System.out.print(maxHight);
			for(int width= 0; width < altitudes.length; width++) {
				if (altitudes[width] == maxHight) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			maxHight--;
			System.out.println();
			
		}
		
	}

}
