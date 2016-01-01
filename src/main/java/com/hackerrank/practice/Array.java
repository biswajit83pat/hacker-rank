package com.hackerrank.practice;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int num0 = 0;
        int num_1 = 0;
        int num1 = 0;
        for(int i = 0; i< size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i< size; i++) {
            //arr[i] = sc.nextInt();
            if(arr[i] > 0)
                num1++;
            else if(arr[i] == 0)
                num0++;
            else if(arr[i] < 0)
                num_1++;
        }
        
        float po = (float)num1/size;
        float ne = (float)num_1/size;
        float ze = (float)num0/size;
        System.out.println(po);
        System.out.println(ne);
        System.out.println(ze);
	}
}
