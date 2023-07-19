package com.onsoft.Exception;

import java.util.Scanner;

public class VoterApp  {
 public static void main(String[] args)throws AgeException {
	Scanner sc = new Scanner(System.in);
	
	//String name = sc.nextLine();
	System.out.println("Name:");
	String name = sc.nextLine();
	System.out.println(name);
	
	System.out.println("Age:");
	int age = sc.nextInt();
	
	if(age >= 18) {
		System.out.println("Valid Age to Vote");
	} else {
		
		throw new AgeException("Invalid Age to Vote");
	}
	System.out.println("Gender:");
	String gender = sc.nextLine();
	
	System.out.println(gender);
	
	System.out.println("Successfully registered");
	
}
}
