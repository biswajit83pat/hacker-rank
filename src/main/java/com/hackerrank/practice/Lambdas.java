package com.hackerrank.practice;

import java.io.*;
import java.util.*;
@FunctionalInterface
interface performOperation{
    int check(int a);
}
class Math{
   public static int checker(performOperation p ,int num){
       return p.check(num);
   }
   
   public performOperation checkEvenOdd() {
		performOperation p = (a)->a%2==0?0:1; 
		return p;
	}
   
   public performOperation checkPrime() {
		performOperation p = (a)->{
			boolean flag = true;
			for(int i = 2; i<=java.lang.Math.sqrt(a) + 2; i++) {
				if(a%i == 0) {
					flag = false;
					break;
				}
			}
			return flag?0:1;
		}; 
		return p;
	}
   
   public performOperation checkPalindrome() {
		performOperation p = (a)->{
			StringBuffer strNum = new StringBuffer(String.valueOf(a));
			String rev = strNum.reverse().toString();
			if(strNum.toString().equals(rev)) {
				return 0;
			} else {
				return 1;
			}
		}; 
		return p;
	}
}

   public class Lambdas {

    public static void main(String[] args)throws IOException {
        Math ob = new Math();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        performOperation op;
        int ret =0;
        String ans=null;
        while(T-->0){
            String s=br.readLine().trim();
            StringTokenizer st=new StringTokenizer(s);
            int ch=Integer.parseInt(st.nextToken());
            int num=Integer.parseInt(st.nextToken());
            if(ch==1){
                op = ob.checkEvenOdd();  
                ret = ob.checker(op,num);
                ans = (ret == 0)?"EVEN":"ODD";
            }
            else if(ch==2){
                op = ob.checkPrime();
                ret = ob.checker(op,num);
                ans = (ret == 0)?"PRIME":"COMPOSITE";
            }
            else if(ch==3){
                op = ob.checkPalindrome();
                ret = ob.checker(op,num);
              	ans = (ret == 0)?"PALINDROME":"NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
          
}
