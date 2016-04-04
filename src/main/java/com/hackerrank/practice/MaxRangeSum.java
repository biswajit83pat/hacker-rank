package com.hackerrank.practice;

import java.util.Scanner;

public class MaxRangeSum {

	public static int maxRangeSum(int[] arr) {
		int overAllMax = 0, currentMax = 0;
		if(arr != null) {
			for(int i = 0; i < arr.length; i++) {
				currentMax = currentMax + arr[i];
				if(currentMax < 0) {
					currentMax = 0;
				}
				if(currentMax > overAllMax) {
					overAllMax = currentMax;
				}
			}
		}
		return overAllMax;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}
}
