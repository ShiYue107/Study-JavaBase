package com.mstanford.scme;

public class Feeder {
	
	public void feed(Animal animal) {
		animal.eat();
	}
	
	public static void main(String[] args) {
		Feeder fr=new Feeder();
		Animal a1=new Horse();
		Animal a2=new Sheep();
		Animal a3=new Tigger();
		Animal a4=new Monkey();
		Animal a5=new Wolf();
		fr.feed(a1);
		fr.feed(a2);
		fr.feed(a3);
		fr.feed(a4);
		fr.feed(a5);
	}
}
