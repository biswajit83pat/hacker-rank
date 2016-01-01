package com.hackerrank.practice;

import java.util.Scanner;

public class FidDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = new int[100];
	        for(int i = 0 ; i <100; i++){
	            arr[i] = -1;
	        }
	        Scanner sc = new Scanner(System.in);
	        String sizeStr = sc.nextLine();
	        int size = Integer.parseInt(sizeStr);
	        for(int i = 0; i < size; i++) {
	            String number = sc.nextLine();
	            
	            for(int iirj = 0 ; iirj <100; iirj++){
		            arr[iirj] = -1;
		        }
	            
	            int oldNum = Integer.parseInt(number);
	            int number1 = oldNum;
	            int itr = 0;
	            while(number1 > 0) {
	                arr[itr] = number1 % 10;
	                itr++;
	                number1 = number1/10;
	            }
	            int maxLimit = String.valueOf(number1).length();
	            int cnt = 0;
	            int result = 0;
	            while(arr[cnt] != -1) {
	                if(arr[cnt] == 0) {
	                    cnt++;
	                    continue;
	                }
	                if(oldNum % arr[cnt] == 0) {
	                    result++;
	                }
	                cnt++;
	            }
	            System.out.println(result);
	        }
	        
	}

}
