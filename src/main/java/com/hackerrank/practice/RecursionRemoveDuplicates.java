package com.hackerrank.practice;

import java.io.IOException;

public class RecursionRemoveDuplicates {

	static {
		if(true)
			try {
				throw new IOException();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException();
			}
	}
	
	public static String stringClean(String str) {
		  if(str.length() <= 1) {
		     return str;
		  }
		  
		  if(str.substring(0,1).equals(str.substring(1,2))) {
		     return str.substring(0,1) + stringClean(str.substring(2));
		  } else {
		     return str.substring(0,1) + stringClean(str.substring(1));
		  }
		  

		}
	
	public static void main(String[] args) {
		System.out.println(stringClean("yyzzza"));
		System.out.println(stringClean("abbbcdd"));
		System.out.println(stringClean("Hello"));
	}
}
