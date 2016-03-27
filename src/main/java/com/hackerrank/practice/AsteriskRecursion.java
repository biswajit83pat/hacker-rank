package com.hackerrank.practice;

public class AsteriskRecursion {
	// starting point
	public static void myMethod(int length)
	{
	    myMethod(length, length);
	}

	public static void myMethod(int length, int i)
	{
	    if (i > 0)
	    {
	        int rowLength = length - i + 1;

	        printRow(rowLength, '*');
	        
	        //throw new UnsupportedOperationException();

	        myMethod(length, i - 1);

	        printRow(rowLength, '*');
	    }
	}

	public static void printRow(int length, char symbol)
	{
	    for (int i = 0; i < length; i++)
	        System.out.print(symbol);
	    System.out.println();
	}
	
	public static void main(String[] args) {
		myMethod(7, 'X');
	}
}
