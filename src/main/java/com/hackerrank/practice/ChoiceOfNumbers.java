package com.hackerrank.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChoiceOfNumbers {
	public static void main(String args[] ) throws Exception {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
        //String line = br.readLine();
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            int total = sc.nextInt();
            int choice = sc.nextInt();
            
            int[] arr = new int[total];
            int[] choiceArr = new int[choice];
            List<Integer> chc = new ArrayList<Integer>();
            
            for(int j = 0; j < total; j++) {
            	arr[j] = sc.nextInt();
            	//dtermine no of set bits
            	int temp = arr[j],count = 0;
            	while((temp) > 0) {
            		temp = (temp & (temp - 1));
            		count++;
            	}
            	chc.add(count);
            }
            Collections.sort(chc);
            int sum = 0;
            for(int l = total-1; l >=choice; l--) {
            	sum += chc.get(l);
            }
            System.out.println(sum);
        }
        
    }
}
