package com.hackerrank.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class OrClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int[] arr = new int[N];
        int result = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            result |= arr[i];
        }
        System.out.println(result);
    }
}
