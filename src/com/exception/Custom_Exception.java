package com.exception;

import java.util.Scanner;

class Voting_Exception extends Exception{
	public Voting_Exception(String message) {
		super(message);
	}
}
public class Custom_Exception {
	public static void validate(int n) throws Voting_Exception{
		if(n < 18) {
			throw new Voting_Exception("You cannot vote");
		}
		else {
			System.out.println("Votable");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int n=sc.nextInt();
		try {
			validate(n);
		}
		//Exception will give priority to specific exceptions than general Exception so that declare general exception at last.
		catch(Voting_Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			//for cleanup code(to clarify whether every line is executed properly)
			System.out.println("Executed Successfully!!!");
		}
	}
}
