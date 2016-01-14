/*
 * Copyright 2015 Sony Corporation
 */
package com.hackerrank.practice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 */
public class ModifiedFibonacci {
public static void main(String[] args) {
    long a,b;
    Scanner sc = new Scanner(System.in);
    a = sc.nextLong();
    b = sc.nextLong();
    int l = sc.nextInt();
    BigInteger[] arr = new BigInteger[l+1];
    arr[0] = new BigInteger(a+"");
    arr[1] = new BigInteger(b+"");
    for(int i = 2; i <=l; i++) {
        arr[i] = new BigInteger("1");
        arr[i] = arr[i-1].multiply(arr[i-1]);
        arr[i] = arr[i].add(arr[i-2]);
    }
    System.out.println(arr[l-1]);
}
}
