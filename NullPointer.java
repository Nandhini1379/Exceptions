package com.onsoft.Exception;


public class NullPointer {
	public static void main(String[] args) {
		System.out.println("Welcome");
		
		String name = null;
		
		try {
		  System.out.println(name.toUpperCase());
		} catch(ArithmeticException ae ) {
			//System.out.println(ae);
			System.out.println("Arthimetic");
		}		
		catch(NullPointerException ne) {
			//System.out.println(ne);
		  //System.out.println("Null Value");
			ne.printStackTrace();
		} 
		catch(Exception ne) {
			System.out.println("Number Value");
		}
		  System.out.println("ThankYou");
	}

}
