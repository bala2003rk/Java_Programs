package com.patterns;

import java.util.Scanner;
/*
         1
       	1 2 
       1 2 3
      1 2 3 4
 */
public class Pyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
