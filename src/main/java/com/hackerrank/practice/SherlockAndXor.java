package com.hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SherlockAndXor {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            //System.out.println("hello world");
            int size = Integer.parseInt(br.readLine());
            int arr[] = new int[size];
            String[] strArr = br.readLine().split("\\s+");
            for(int j = 0; j < size; j++) {
            	arr[j] = Integer.parseInt(strArr[j]);
            }
            
            int count = 0;
            
            for(int k = 0; k < arr.length; k++) {
            	for(int l = k+1; l <arr.length; l++) {
            		if((arr[k] ^ arr[l])%2 == 1) {
            			count++;
            		}
            	}
            }
            
            System.out.println(count);
            
        }
	}

}
