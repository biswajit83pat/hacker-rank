package com.linkedlist.practice;

public class JavaPassByReference {

	static class Dog{
		private String name;
		
		public Dog(String name) {
			this.name = name;
		}
		
		public void print() {
			System.out.println(name);
		}
		
		public void foo(Dog d) {
		    d = new Dog("Fifi"); // creating the "Fifi" dog
		}
	}
	
	public static void main(String[] args) {
		Dog aDog = new Dog("Max");// creating the "Max" dog
		// at this point, aDog points to the "Max" dog
		aDog.print();
		aDog.foo(aDog);
		aDog.print();
		// aDog still points to the "Max" dog
	}
	
}
