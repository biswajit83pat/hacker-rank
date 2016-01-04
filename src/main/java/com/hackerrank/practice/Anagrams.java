package com.hackerrank.practice;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < size; i++) {
            String words = sc.nextLine();
            String[] string12 = words.split(" ");
            int result = 0;
            String first = string12[0];
            String second = string12[1];
            for(int j = 0; j < first.length(); j++) {
                result = result ^ first.charAt(j);
            }
            for(int j = 0; j < second.length(); j++) {
                result = result ^ second.charAt(j);
            }
            if(result == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");    
            }
        }
	}

}
