package com.saki.java.chapter04;


public class ForEachWithHumans {

	public static void main(String[] args) {

		Humans[] humansArray = new Humans[15];
		
		humansArray[0] = new Humans("Inge", 22);
		humansArray[1] = new Humans("Otto", 34);
		humansArray[2] = new Humans("Johanna", 43);
		humansArray[3] = new Humans("Nulunga", 53);
		humansArray[4] = new Humans("Reinhard", 44);
		humansArray[5] = new Humans("Hannes", 54);
		humansArray[6] = new Humans("Floriana", 37);
		humansArray[7] = new Humans("Dolma", 43);
		humansArray[8] = new Humans("Albert", 36);
		humansArray[9] = new Humans("Julian", 41);
		humansArray[10]= new Humans("Malunat", 26);
		humansArray[11]= new Humans("Qualder", 64);
		humansArray[12]= new Humans("Hrailu", 58);
		humansArray[13]= new Humans("Uhalua", 48);
		humansArray[14]= new Humans("Emach", 28);

		for(Humans h: humansArray) {
			System.out.println(h);
		}


	}

}
