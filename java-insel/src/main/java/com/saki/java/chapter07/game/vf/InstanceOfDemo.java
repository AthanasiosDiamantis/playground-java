package com.saki.java.chapter07.game.vf;

public class InstanceOfDemo {

	public static void main(String[] args) {
		String s = "Toll";

		System.out.println(s instanceof String);
		System.out.println("Toll" instanceof Object);
		System.out.println(new Player() instanceof Object);

		System.out.println("----------- next --------------");

		Room go1 = new Room();
		System.out.println(go1 instanceof Room);
		System.out.println(go1 instanceof GameObject);
		System.out.println(go1 instanceof Object);

		System.out.println("----------- next --------------");

		GameObject go2 = new Room();
		System.out.println(go2 instanceof Room);
		System.out.println(go2 instanceof GameObject);
		System.out.println(go2 instanceof Object);
		System.out.println(go2 instanceof Player);

		System.out.println("----------- next --------------");

		Object go3 = new Room();
		System.out.println(go3 instanceof Room);
		System.out.println(go3 instanceof GameObject);
		System.out.println(go3 instanceof Object);
		System.out.println(go3 instanceof Player);
		System.out.println(go3 instanceof String);
		

	}

}
