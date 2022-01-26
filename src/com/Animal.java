package com;

public class Animal {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		System.out.println(d1);
		System.out.println(d2);
		
		d1=null;
		
		Runtime.getRuntime();
		
		System.out.println(d1);
		System.out.println(d2);
		
		
		
		

	}

}
