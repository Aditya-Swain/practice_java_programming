package com.org.Practice1;


class Test{
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.makeSound();
	}
}
public class Animal {
	
	
	public static void main(String[] args) {
Animal animal = new Cat();
		animal.makeSound();
	}
		public void makeSound() {
			System.out.println("bhow");
		}
}


class Cat extends Animal{
	public  void makeSound() {
		System.out.println("meow");
	}
}


