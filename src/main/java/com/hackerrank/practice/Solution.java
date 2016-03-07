package com.hackerrank.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for(int i = 0; i < num; i++) {
            int numOfElem = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>(numOfElem);
            for(int j = 0; j <numOfElem; j++){
                list.add(sc.nextInt());
            }
            map.put(i+1,list);
        }
        int exper = sc.nextInt();
        for(int i = 0; i < exper; i++) {
            int line = sc.nextInt();
            int index = sc.nextInt();
            List<Integer> listInt = map.get(line);
            if(listInt != null){
                Integer value = null;
                try{
                    value = listInt.get(index);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                if(value == null){
                    System.out.println("ERROR!");
                } else {
                    System.out.println(value);
                }
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
