package com.hackerrank.practice;

import java.util.Scanner;

public class Format {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String timeFormat = sc.nextLine();
		int hour = Integer.parseInt(timeFormat.substring(0, 2));
		String amPm = timeFormat.substring(8);
		if((hour != 12 && amPm.equalsIgnoreCase("PM")) || (hour == 12 && amPm.equalsIgnoreCase("AM"))) {
			hour = hour + 12;
		}
		hour = hour % 24;
		if(hour<10)
			System.out.println("0" + hour + timeFormat.substring(2,8));
		else
			System.out.println(hour + timeFormat.substring(2,8));
	}
	//04:59:59AM
	//07:05:45PM
	//12:40:22AM
	//12:45:54PM
}
