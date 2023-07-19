package com.onsoft.Exception;

public class tryCatch {
	public static void main(String[] args) {
		System.out.println("Welcome");
		int a = 10;
		int b = 5;
		int c = 0;
		
		System.out.println(a+b+c);
		try {
		System.out.println(a/c);
		} catch(Exception e) {
			System.out.println("Dont divide by zero");
		}
		System.out.println(a*b);
		System.out.println("Thank you");
	}

}
