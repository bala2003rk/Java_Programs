package com.patterns;

import java.util.Scanner;
/*

    1 2 3 4 5
     1 2 3 4
      1 2 3
       1 2 
        1
 */
public class Inverted_Pyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n-i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
