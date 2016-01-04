package com.hackerrank.practice;

import java.util.Scanner;

public class UniqueChars {

	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[200];
        for(int i = 0; i < size; i ++) {
        	sc.nextLine();
            String testStr = sc.nextLine().toLowerCase();
            boolean flag = false;
            for(int j = 0; j < testStr.length(); j++) {
                arr[testStr.charAt(j)]++;
                if(arr[testStr.charAt(j)] > 1) {
                    System.out.println("NOT UNIQUE");
                    flag = true;
                    break;
                }
            }
            if(!flag)
            System.out.println("UNIQUE");
        }
	}

}
