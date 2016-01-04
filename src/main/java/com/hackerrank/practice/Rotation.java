package com.hackerrank.practice;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < size; i ++) {
            int rows  = sc.nextInt();
            int columns = sc.nextInt();
            String[][] arr = new String[rows][columns];
            sc.nextLine();
            for(int r = 0; r < rows; r++) {
                String str = sc.nextLine();
                for(int c = 0; c < columns ; c++) {
                    arr[r][c] = str.charAt(c) + "";
                }
            }
            String orientation = sc.nextLine();
            
            if(orientation.equalsIgnoreCase("V")) {
                for(int r = 0; r< rows; r ++){
                    for(int c = columns-1; c>=0; c--){
                        System.out.print(arr[r][c]);
                    }
                    System.out.println();
                }
            } else {//H
                for(int r = rows-1; r>= 0; r --){
                    for(int c = 0; c< columns; c++){
                        System.out.print(arr[r][c]);
                    }
                    System.out.println();
                }
            }
            
            //prints 
            
            System.out.println();
        }
	}

}
