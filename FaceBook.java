package com.onsoft.Exception;
import java.util.*;

public class FaceBook {
	public static void main(String[] args) throws LoginException {
		Scanner sc = new Scanner(System.in);
		System.out.println("UserName");
		String name = sc.nextLine();
		System.out.println("Password:");
		int psd = sc.nextInt();
		
		if(name.equals("Nandy")&& psd == 1234) {
			System.out.println("Login Sucess");
		}  
		else {
			throw new LoginException("Login failed");
		}
		
		System.out.println("Welcome");
		
				
				
	}

}
