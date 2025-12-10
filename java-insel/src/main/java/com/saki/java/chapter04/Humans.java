package com.saki.java.chapter04;

public class Humans {

	private String name;
	private int age;
	
	Humans(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Getter
	 public String getName() {
		return name;
	}
	 public int getAge() {
		 return age;
	 }
	 
	 public String toString() {
		return "Name: " + name + 
			   "\nAlter: " + age;
		 
	 }
	 


}
