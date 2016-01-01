package com.hackerrank.practice;

import java.util.Scanner;

public class Matrix {
		 public static void main(String[] args) {
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        Scanner sc = new Scanner(System.in);
		        int size = sc.nextInt();
		        int leftDiagSum = 0, rightDiagSum = 0;
		        int leftCnt = 0, rightCnt = size-1;
		        int[][] arr = new int[size][size];
		        for(int i = 0; i < size; i ++) {
		             for(int j = 0; j < size; j++) {
		                 arr[i][j] = sc.nextInt();
		             }
		        }
		        
		        for(int i = 0; i < size; i ++) {
		             for(int j = 0; j < size; j++) {
		                 System.out.print(arr[i][j] + " ");
		             }
		             System.out.println();
		        }
		        
		        for(int i = 0; i < size; i ++) {
		            for(int j = 0; j < size; j++) {
		                if(j == leftCnt){
		                    leftDiagSum += arr[i][j];
		                    
		                }
		                if(j == rightCnt){
		                    rightDiagSum += arr[i][j];
		                }
		            }
		            leftCnt++;
		            rightCnt--;
		        }
		        int diff = leftDiagSum - rightDiagSum;
		        if(diff < 0)
		            diff = diff * -1;
		        System.out.println(diff);
		    }
		}

