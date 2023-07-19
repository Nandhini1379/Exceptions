package com.onsoft.Exception;

public class Indexoutof {
	public static void main(String[] args) {
		String[] a = {"Array","Index"};
		 
		try {
		System.out.println(a[2]);
		} 
		catch (ArithmeticException ae) {
			System.out.println("Arithmetic");
		} catch (NumberFormatException nf) {
			System.out.println("String can not be converted to Integer");
		} catch(ArrayIndexOutOfBoundsException io) {
			System.out.println("IndexOutOfBound");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("ThankYou");
		
	}

}
