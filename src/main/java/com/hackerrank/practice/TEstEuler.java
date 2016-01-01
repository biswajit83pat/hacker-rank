package com.hackerrank.practice;

public class TEstEuler {
	public static void main(String[] args) {
		System.out.println(sumOfMultiplesOf3And5(10));
	}

	public static long sumOfMultiplesOf3And5(long limit) {
		limit = limit - 1;
		long numOf3Terms = (int) (limit / 3);
		long numOf5Terms = (int) (limit / 5);
		long numOf15Terms = (int) (limit / 15);

		long sumOf3s = (numOf3Terms) * (6 + (numOf3Terms - 1) * 3);
				sumOf3s = sumOf3s/2;
		long sumOf5s = (numOf5Terms) * (10 + (numOf5Terms - 1) * 5);
				sumOf5s = sumOf5s/2;
		long sumOf15s = (numOf15Terms) * (30 + (numOf15Terms - 1) * 15);
				sumOf15s = sumOf15s/2;
		long total = (sumOf3s + sumOf5s) - sumOf15s;
		return total;
	}
}
