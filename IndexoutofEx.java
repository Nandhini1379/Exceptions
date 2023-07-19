package com.onsoft.Exception;

public class IndexoutofEx {
	public static void main(String[] args) {
		String name = "Nandy";
		 
		try {
		System.out.println(name.charAt(6));
		} 
		catch (ArithmeticException ae) {
			System.out.println("Arithmetic");
		} catch (NumberFormatException nf) {
			System.out.println("String can not be converted to Integer");
		} catch(StringIndexOutOfBoundsException io) {
			System.out.println("String index Bound");
		} 
		catch (Exception e) {
			System.out.println("Exception");
		} finally {
		System.out.println("ThankYou");
		}
		System.out.println("End");
		
	}

}
