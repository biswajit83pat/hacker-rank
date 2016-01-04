package com.hackerrank.crossover.practice;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		// Write your code here
        String object = "abcdefgh";
        int objectLength = object.length();
        char c[] = new char[objectLength];
        object.getChars(0, objectLength, c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c,1,4);
        int i ;
        int j;
        try{
        	while((i = input1.read())==(j=input2.read())){
        		System.out.println((char)i);
        	}
        } catch(IOException e) {
        	e.printStackTrace();
        }
        
	}

}
