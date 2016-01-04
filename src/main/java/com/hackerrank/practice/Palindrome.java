package com.hackerrank.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < size; i ++){
            String strTest = sc.nextLine();
            int last = strTest.length()-1;
            int first = 0;
            boolean flag = false;
            while(last > first) {
                if(strTest.charAt(first) == strTest.charAt(last)){
                    first ++;
                    last --;
                } else {
                    flag = true;
                    break;
                }
            }
            if(flag)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
	}

}
