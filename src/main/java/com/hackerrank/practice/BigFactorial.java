/*
 * Copyright 2015 Sony Corporation
 */
package com.hackerrank.practice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 */
public class BigFactorial {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger[] arr = new BigInteger[n+1];
    /*for(int i = 0; i < n + 1; i ++) {
        arr[i] = new BigInteger("1");
    }*/
    arr[0] = new BigInteger("1");
    arr[1] = new BigInteger("1");
    for(int i = 2; i <=n; i++) {
        arr[i] = new BigInteger(i+"");
        arr[i] = arr[i].multiply(arr[i-1]);
    }
    
    System.out.println(arr[n] + "");
}
}
