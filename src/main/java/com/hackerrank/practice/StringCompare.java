package com.hackerrank.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int num = sc.nextInt();
		String[] arr = new String[word.length() - num + 1];
		for (int i = 0; i <= word.length() - num; i++) {
			String str = word.substring(i, num + i);
			arr[i] = str;
		}

		Arrays.sort(arr, asc);

		System.out.println(arr[0]);
		Arrays.sort(arr, desc);
		System.out.println(arr[0]);
	}

	public static Comparator<String> asc = new Comparator<String>() {
		@Override
		public int compare(String s1, String s2) {
			return s1.compareTo(s2);
		}
	};

	public static Comparator<String> desc = new Comparator<String>() {
		@Override
		public int compare(String s1, String s2) {
			return s2.compareTo(s1);
		}
	};
}
