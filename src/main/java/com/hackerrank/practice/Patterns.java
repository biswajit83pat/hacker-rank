package com.hackerrank.practice;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int spaceCnt = height-1,hashCnt = 1;
        for(int i = 0 ; i < height; i++) {
            for(int it = 0; it <spaceCnt; it++)
                System.out.print(" ");
            for(int j = 0; j <hashCnt; j++){
                System.out.print("#");
            }
            System.out.println();
            hashCnt++;
            spaceCnt--;
        }
	}
}
