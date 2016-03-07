package com.hackerrank.practice;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Soluton {
	public static void main(String[] args) {
		int d2 = 6;
        int m2 = 6;
        int y2 = 2015;
        int d1 = 9;
        int m1 = 6;
        int y1 = 2016;
		
		if(y2>y1){
            System.out.println(10000);
            System.exit(0);
        } else if(y2 == y1 && m2>m1) {
            System.out.println((m2-m1)*15);
            System.exit(0);
        } else if(y2 == y1 && m2 == m1 && d2>d1) {
            System.out.println((d2-d1)*500);
            System.exit(0);
        } else if(y2 == y1 && m2 == m1 && d2==d1) {
            System.out.println(0);
            System.exit(0);
        }
		
		System.out.println(0);

	}
}
