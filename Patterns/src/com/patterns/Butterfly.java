package com.patterns;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
        int n = s.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < 2 * (n - i - 1); spaces++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 2 * n ; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < 2 * (n - i - 1); spaces++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        s.close();
    }
}
