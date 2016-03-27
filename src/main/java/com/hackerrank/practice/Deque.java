package com.hackerrank.practice;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Deque {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
         ArrayDeque deque = new ArrayDeque();
         int n = in.nextInt();
         int m = in.nextInt();

         /*for (int i = 0; i < n; i++) {
             int num = in.nextInt();
             deque.add(num);
         }
         
         Map<Integer>, Integer> map = new HashMap<>();
         while(!deque.isEmpty()) {
             Set<Integer> set = new HashSet<>();
             for(int i = 0; i < m; i ++) {
                 set.add(deque.p)
                 
             }
         }*/
         Map<Integer, Integer> map = new HashMap<>();
         Set<Integer> set = new HashSet<>();
         for(int j = 0; j<0; j ++) {
             for(int i = 0; i<m; i++) {
                 set.add(in.nextInt());
             }
            	 
             if(map.get(1) != null && set.size() > map.get(1).intValue()) {
                 map.put(1,set.size());
             } else if (map.get(1) == null) {
            	map.put(1, set.size()); 
             }
         }
         System.out.println(map.get(1).intValue());
	}
         
     }
