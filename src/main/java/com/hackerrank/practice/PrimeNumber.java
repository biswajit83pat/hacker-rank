package com.hackerrank.practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = 0; i < size; i++) {
            long number = sc.nextLong();
            long sqrt = (long)(java.lang.Math.sqrt(number) + 1);
            if(number <= 1)
            {
                    System.out.println("NOT PRIME");
                    continue;   
            }
            boolean flag = false;
            for(long j = 2; j < sqrt; j ++) {
                if((int)(number % j) == 0)
                {
                    //System.out.println("NOT PRIME");
                	flag = true;
                    break;
                }
            }
            if(!flag)
            	System.out.println("PRIME");
            else
            	System.out.println("NOT PRIME");
            
        }
	}
}
