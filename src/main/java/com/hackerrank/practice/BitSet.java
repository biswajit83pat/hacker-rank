package com.hackerrank.practice;

import java.util.Scanner;

public class BitSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		java.util.BitSet a1BS = new java.util.BitSet(a1);
		java.util.BitSet b1BS = new java.util.BitSet(b1);
		while(sc.hasNext()) {
			/*String a1Str = Integer.toBinaryString(a1);
	        String b1Str = Integer.toBinaryString(b1);
	        for(int i = 0; i < a1Str.length(); i++) {
	            if(a1Str.charAt(i)=='1')a1BS.set(i);
	        }
	        for(int i = 0; i < a1Str.length(); i++) {
	            if(b1Str.charAt(i) == '1')b1BS.set(i);
	        }*/
	        
	        String op = sc.next();
	        if(op.equals("AND")) {
	        	int first = Integer.parseInt(sc.next());
	        	int second = Integer.parseInt(sc.next());
	        	if(first == 1) {
	        		a1BS.and(b1BS);
	        	} else if (first == 2) {
	        		b1BS.and(a1BS);
	        	}
	        	System.out.println(a1BS.cardinality() + " " + b1BS.cardinality());
	        } else if (op.equals("OR")) {
	        	int first = Integer.parseInt(sc.next());
	        	int second = Integer.parseInt(sc.next());
	        	if(first == 1) {
	        		a1BS.or(b1BS);
	        	} else if (first == 2) {
	        		b1BS.or(a1BS);
	        	}
	        	System.out.println(a1BS.cardinality() + " " + b1BS.cardinality());
	        } else if (op.equals("XOR")) {
	        	int first = Integer.parseInt(sc.next());
	        	int second = Integer.parseInt(sc.next());
	        	if(first == 1) {
	        		a1BS.xor(b1BS);
	        	} else if (first == 2) {
	        		b1BS.xor(a1BS);
	        	}
	        	System.out.println(a1BS.cardinality() + " " + b1BS.cardinality());
	        } else if (op.equals("FLIP")) {
	        	int set = Integer.parseInt(sc.next());
	        	int index = Integer.parseInt(sc.next());
	        	if(set == 1) {
	        		a1BS.flip(index);
	        	} else if(set == 2) {
	        		b1BS.flip(index);
	        	}
	        	System.out.println(a1BS.cardinality() + " " + b1BS.cardinality());
	        } else if (op.equals("SET")) {
	        	int set = Integer.parseInt(sc.next());
	        	int index = Integer.parseInt(sc.next());
	        	if(set == 1) {
	        		a1BS.set(index);
	        	} else if(set == 2) {
	        		b1BS.set(index);
	        	}
	        	System.out.println(a1BS.cardinality() + " " + b1BS.cardinality());
	        }
        
		}
        
        
	}
}