package com.onsoft.Exception;


public class Numberformat {
	public static void main(String[] args) {
		String numberPlat = "TN14AD5646";

		
		try {
			int a = Integer.parseInt(numberPlat);
			System.out.println(a);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic");
		} catch (NumberFormatException nf) {
			System.out.println("String can not be converted to Integer");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
