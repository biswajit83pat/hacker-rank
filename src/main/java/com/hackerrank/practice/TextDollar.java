package com.hackerrank.practice;

import java.util.Scanner;

import org.testng.Assert;

public class TextDollar {

	private final static String[] unitArr = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	private final static String[] tiesArr = {"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	private final static String[] tensArr = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	
	public static String dollarToText(int numToBeConverted) {
		
		//Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();


		//while(num > 0) {
			
			StringBuffer sb = new StringBuffer(32);
			
			//Taking int as less than 1 billion numbers as constraint
			int original = numToBeConverted;
			int size = (int) (java.lang.Math.log10(original) + 1);

			int firstBlock = (size%3 == 0) ? 3: ((int)(size%3));
			boolean firstFlag = true;
			
			if(original <= 0) {
				return "ZeroDollars";//Treat negative and 0 as ZeroDollars!
 			}
			
	
			int sizeDig = (int) (java.lang.Math.log10(original) + 1);
			if(size > 6) {
				if(firstFlag) {//check how many blocks to take first time
					//sb.append(unitArr[original-1]);
					int mostSigDig = (int) (original/java.lang.Math.pow(10, sizeDig - firstBlock));
					/////////sb.append(unitArr[(int)(original - java.lang.Math.pow(10, sizeDig)) - 1]);
					//sb.append(hundredResolver((int)(original/java.lang.Math.pow(10, firstBlock))));
					sb.append(hundredResolver(mostSigDig)).append("Million");
					
					//remove upto first 3 significant digits
					original = original - (int)(mostSigDig*java.lang.Math.pow(10, (sizeDig - firstBlock) ));
					
					firstBlock = 3;//Reset to 3
					
					if(original == 0){//Special case when after million all 0s.
						return sb.append("Dollars").toString();
					}
					
					mostSigDig = (int) (original/java.lang.Math.pow(10, firstBlock));
					sb.append(hundredResolver(mostSigDig)).append("Thousand");
					original = original - (int)(mostSigDig*java.lang.Math.pow(10, firstBlock ));
					return sb.append(hundredResolver(original)).append("Dollars").toString();
				}
			} else if(size > 3) {
				if(firstFlag) {//check how many blocks to take first time
					//sb.append(unitArr[original-1]);
					int mostSigDig = (int) (original/java.lang.Math.pow(10, sizeDig - firstBlock));
//<UNCOMMENt>						//////sb.append(unitArr[mostSigDig-1]).append("Thousand");
					sb.append(hundredResolver(mostSigDig)).append("Thousand");
					//sb.append(hundredResolver((int)(original/java.lang.Math.pow(10, firstBlock))));
					sb.append(hundredResolver(original - (int)(mostSigDig*java.lang.Math.pow(10, (sizeDig - firstBlock) ))));
					firstFlag = false;
					
					return sb.append("Dollars").toString();
					//original = original - ((int) (original/java.lang.Math.pow(10,firstBlock)));
				}
			} else {
				sb.append(hundredResolver(original));
			}
				
			return sb.append("Dollars").toString();
			
		
		//num--;
		//}
		//return sb.toString();
		
		
	}
	
	private static String hundredResolver(int number) {
		
		
		StringBuffer sbHndrds = new StringBuffer(32);
		int sizeDig = (int) (java.lang.Math.log10(number) + 1);
		if(sizeDig > 2) {
			int	hundreds = (int)(number/100);
			return unitArr[hundreds - 1] + "Hundred" + hundredResolver(number - (int)(number/100)*100);
			//sbHndrds.append("Hundred");
		}
		else if(sizeDig > 1) {
			
			//Check for tens digit
			int tensDigit = (int)(number/10);
			
			if(tensDigit == 0) {
				return "" + hundredResolver(number/10);
			} else if(tensDigit == 1) {
				return tensArr[number - 10];
			} else {//twenty, thirty, etc..
				return tiesArr[(int)(number/10) - 2] + hundredResolver(number - (int)(number/10)*10);
			}
		} else if(sizeDig == 1) {
			if(number == 0) {
				return "";//Return nothing
			}
			return unitArr[number-1];//Return last unit digit number
		}
		
		
		return sbHndrds.toString();
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		
		//while(num > 0) {
		while(sc.hasNext()) {
			
			System.out.println(dollarToText(sc.nextInt()));
			
			//num--;
		}
		
		//System.out.println(dollarToText(1000000));
		/*System.out.println(hundredResolver(432));
		System.out.println(hundredResolver(32));
		System.out.println(hundredResolver(2));
		System.out.println(hundredResolver(100));*/
		
		/*System.out.println("1342: " + dollarToText("1342"));
		System.out.println("901342: " + dollarToText("901342"));
		System.out.println("2200: " + dollarToText("2200"));
		System.out.println("2200: " + dollarToText("1"));
		System.out.println("2200: " + dollarToText("0"));*/
		
		/*System.out.println("1,901,342: " + dollarToText("1901342"));
		System.out.println("1,900,312: " + dollarToText("1900312"));
		System.out.println("1,900,302: " + dollarToText("1900302"));
		System.out.println("1,900,302: " + dollarToText("1900002"));*/
	}
}
