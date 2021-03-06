package com.hackerrank.practice.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AccessPrivate {
	public static void main(String[] args) throws Exception {

		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int num=Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
			o = new AccessPrivate.Inner().new Private();
	        System.out.println(num + " " + ((com.hackerrank.practice.java.AccessPrivate.Inner.Private) o).powerof2(num));
	        System.out.println("An instance of class: "+o.getClass().getCanonicalName()+" has been created");
			
		}//end of try
		
		catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}//end of main
	static class Inner
	{
		private class Private{
			private String powerof2(int num)
			{
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}//end of Inner
	
}//end of Solution

