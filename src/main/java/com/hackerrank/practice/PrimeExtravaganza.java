package com.hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeExtravaganza {
	
	private class Prime{
	    public void checkPrime(int... args) {
	        StringBuilder sb = new StringBuilder(32);
	        for(int i = 0; i <args.length; i++) {
	            boolean isPrime = false;
	            if(args[i] < 2) {
	                isPrime = false;
	            } else if(args[i] == 2) {isPrime = true;}
	            else {
	                for(int j = 2; j<=(int)(java.lang.Math.sqrt(args[i])+1);j++) {
	                    if(args[i]%j == 0){
	                        isPrime = false;
	                        break;
	                    }
	                    isPrime = true;
	                }
	            }
	            if(isPrime)
	                sb.append(args[i]).append(" ");
	        }
	        System.out.println(sb.toString());
	    }
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		PrimeExtravaganza.Prime ob=new PrimeExtravaganza().new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		/*Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			long toTest = sc.nextLong();
			boolean isPrime = true;
			if (toTest <= 1) {
				isPrime = false;
			} else {
				for (long j = 2; j < (long) (Math.sqrt(toTest) + 1); j++) {

					if (toTest % j == 0) {
						isPrime = false;
						break;
					}
					isPrime = true;
				}
				
			}
			if (isPrime) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}*/
	}
}
