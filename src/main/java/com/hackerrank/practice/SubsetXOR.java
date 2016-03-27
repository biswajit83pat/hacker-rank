package com.hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SubsetXOR {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
        String line = br.readLine();
        int N = Integer.parseInt(line.trim());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            int[] arr = new int[num];
            String arrContents = br.readLine();
            String[] arrString = arrContents.split(" ");
            for(int j = 0; j <num; j++) {
            	arr[j] = Integer.parseInt(arrString[j]);
            }
            
            //generate all subsets by bit manipulation
            int result = 0;
            int size = arr.length;
            for(int k = 1; k < (1<<size); k++) {
            	for(int l = 0; l < size; l++) {
            		if((k & (1<<l)) == 1) {
            			result ^= arr[l];
            			//System.out.print(arr[l] + " ");
            		}
            	}
            	//System.out.println();
            }
            System.out.println(result);
            
        }
    }
	
}
