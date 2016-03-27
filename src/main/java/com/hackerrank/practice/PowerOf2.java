package com.hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOf2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	int num = Integer.parseInt(br.readLine());
        	int[] arr = new int[num];
        	String arrCnts = br.readLine();
        	String[] arrStr = arrCnts.split(" ");
        	boolean flag = false;
        	for(int j = 0; j < num; j++) {
        		arr[j] = Integer.parseInt(arrStr[j]);
        		if((arr[j] & (arr[j]-1)) == 0) {//check if any single element is power of 2.
        			flag = true;
        			break;
        		}
        	}
        	if(flag) {
        		System.out.println("YES");
        	} else {
        		System.out.println("NO");
        	}
            
        }
	}
}
