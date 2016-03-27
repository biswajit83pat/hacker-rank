package com.hackerrank.practice;

public class StringPermutations {
	
	public static void main(String[] args) {
		//String[] word = {"a","b","c","d","e"};
		//String[] word = {"a","b","c","d","a"};
		String[] word = {"a","a"};
		
		for(int i = 1; i < (1<<word.length); i++) {//initialize with 0 for empty subset
			for(int j = 0; j <word.length; j++) {
				if((i & (1<<j)) != 0) {
					System.out.print(word[j] + " ");
				}
			}
			System.out.println();
		}
	}
	
}
