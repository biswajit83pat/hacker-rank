package com.hackerrank.practice.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {5,1,6,2,4,3};
		int[] sortedArr = insertionSort(arr);
		for(int i:sortedArr) {
			System.out.print(i + " ");
		}
		
	}
	
	public static int[] insertionSort(int[] arrToBeSorted) {
		if(arrToBeSorted != null) {
			int j, key;
			for(int i = 1; i< arrToBeSorted.length; i++) {
				key = arrToBeSorted[i];
				j = i - 1;
				while(j >= 0 && arrToBeSorted[j] > key) {
					arrToBeSorted[j+1] = arrToBeSorted[j];
					j--;
				}
				arrToBeSorted[j+1] = key;
			}
		}
		return arrToBeSorted;
	}
}
