package com.hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOf21 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.out.println(Integer.toHexString(-1));
		//System.out.println(Integer.toBinaryString(-1));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        //br.read(
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	int num = Integer.parseInt(br.readLine());
        	int[] arr = new int[num];
        	String arrCnts = br.readLine();
        	String[] arrStr = arrCnts.split(" ");
        	boolean flag = false;
        	int max = Integer.MIN_VALUE;
        	for(int j = 0; j < num; j++) {
        		arr[j] = Integer.parseInt(arrStr[j]);
        		if(max < arr[j]) {
        			max = arr[j];
        		}
        	}
        	
        	int len = (int) (java.lang.Math.log10(max) / java.lang.Math.log10(2));
        	
            for (int k = 0; k <= len; k++) {
                int mask = 1 << k, mul = -1;//ffffffff
                for (int j = 0; j < num; j++) {
                    if ((arr[j] & mask) != 0) {
                        if (mul == -1)
                            mul = arr[j];
                        else
                            mul &= arr[j];
                    }
                }
                if (mul == -1)
                    continue;
                else if (mul == mask) {
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
