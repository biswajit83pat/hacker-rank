package com.hackerrank.practice;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        double r = sc.nextDouble();
        int m = sc.nextInt();
        //sc.nextLine();
        double interest = (double) p * r * m;
        interest = (double) (interest/1200);
        System.out.printf("%.2f", interest);
        //System.out.println();
	}

}
