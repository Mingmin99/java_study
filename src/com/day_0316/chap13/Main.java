package com.day_0316.chap13;

public class Main {

	public static void main(String[] args) {
		Slime slime = new Slime();
		Monster monster = new Slime();
		slime.run();
		monster.run();

// Character[] characters = new Character [5];
//
//		Character character = new Wizard();
//
//		if (character instanceof Wizard) {
//			Wizard wizard = (Wizard) character;
//			System.out.println("형 변환 가능");
//		} else {
//			System.out.println("형변환 불가");
//		}

//		Wizard w = new Wizard();
//		w.name = "민영";
//		Character c = w;
//		c.name = "바보";
//		Kinoko k = new Kinoko();
//		c.attack(k);
//		c.fireball(k);
	}
}
