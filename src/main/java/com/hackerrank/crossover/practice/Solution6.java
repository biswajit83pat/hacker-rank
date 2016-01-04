package com.hackerrank.crossover.practice;

import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		// Write your code here
        //Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
        
        int[] arr = {1};
        System.out.println(xorMod(arr));
        
	}
	
	static int xorMod(int[] arr) {
		int result = 0;
		if(arr != null) {
			for(int i = 0; i < arr.length; i++) {
				result = result ^ arr[i];
			}
		}
		return result;
		

    }

}
