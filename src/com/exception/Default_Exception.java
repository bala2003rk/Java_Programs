package com.exception;

import java.util.Scanner;

public class Default_Exception {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try {
			int result=n/0;
			System.out.println("Result : "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error : "+e.getMessage());
		}
		try {
			int arr[]= {1,2,3};
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : "+e.getMessage());
		}
		try {
			String str=null;
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System.out.println("Error : "+e.getMessage());
		}
		finally {
			System.out.println("Executed");
		}
	}
}
