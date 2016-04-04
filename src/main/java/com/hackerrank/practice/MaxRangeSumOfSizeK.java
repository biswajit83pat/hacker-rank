package com.hackerrank.practice;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class MaxRangeSumOfSizeK {

	public static int getMaxSubArray(int[] arr, int size) {
		if(arr == null) {
			return 0;
		}
		
		if(arr.length <= size) {
			return 0;
		}
		
		int sum = arr[0];
		
		for(int i = 1; i <size; i++) {
			sum = sum + arr[i];
		}
		
		int maxSum = sum;
		
		int n = arr.length;
		
		for(int i = size; i <n; i++) {
			sum = sum - arr[i - size] + arr[i];
			if(sum > maxSum){
				maxSum = sum;
			}
		}
		
		return maxSum>0?maxSum:0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int[] arr = {7 ,-3, -10, 4, 2, 8, -2, 4, -5, -2};int k = 5;
		//int[] arr = {-4, 3, -10, 5, 3, -7, -3, 7, -6, 3};int k = 6;
		//int[] arr = {-7, 0, -45, 34, -24, 7};int k = 3;
	
		//System.out.println(getMaxSubArray(arr, k));
		
		
	}
}
