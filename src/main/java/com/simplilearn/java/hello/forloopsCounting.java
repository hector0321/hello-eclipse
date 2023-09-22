package com.simplilearn.java.hello;

import java.util.Scanner;


public class forloopsCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an interger:" );
			int number =
					scanner.nextInt();
			
			scanner.close();
			
			for (int i = 0; i <= number; i++)
			{System.out.println(i);
			
			}
		
		
		
	}

}
