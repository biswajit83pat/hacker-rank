package com.hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SubsetXOR1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	String[] k = br.readLine().split(" ");
        	String s = br.readLine();
        	if(Integer.parseInt(k[0])==1){
        	 System.out.println(Integer.parseInt(s));
        	}
        	else{
             System.out.println(0);
        	}
        }
    }
	
}
