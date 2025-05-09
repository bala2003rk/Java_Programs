package com.patterns;

import java.util.Scanner;

/*
 	 * * * *
 	  * * *
 	   * *
 	    *  
 	    *  
 	   * *
 	  * * *
 	 * * * *
 
 */
public class HourGlass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n-1;i>0;i--) {
			for(int spaces=0;spaces<=n-i-1;spaces++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int spaces=0;spaces<=n-i-1;spaces++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
