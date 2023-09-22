package com.simplilearn.java.hello;

import java.util.Scanner;


public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new 
				Scanner(System.in);
		
		System.out.print("please enter your age: ");
		int age = scanner.nextInt();
		
		if (age < 0) {
			System.out.println("invalid age input. Age cannot be negative.");
			
		}else if (age < 16) {System.out.println("you cant drive.");
		
		} else if (age >= 16 && age <= 17) {System.out.println("you can drive nut not vote.");
		
		} else if (age >= 18 && age <=24) {System.out.println("you can vote but not rent a car");
		
		} else {
			System.out.println("you can do pretty much anything.");
			
			
			
			
			}
		
		
		
		
	}

}
