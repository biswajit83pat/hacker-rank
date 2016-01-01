package com.hackerrank.practice;

import java.util.Scanner;

public class DataTypes {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        //for(int i = 0; i < 9; i++){
	            //String dataType = sc.nextLine();
	        System.out.println(determineDataTypes("5.35"));
	        System.out.println(determineDataTypes("a"));
	        System.out.println(determineDataTypes("false"));
	        System.out.println(determineDataTypes("100"));
	        System.out.println(determineDataTypes("I am a code monkey"));
	        System.out.println(determineDataTypes("true"));
	        System.out.println(determineDataTypes("17.3"));
	        System.out.println(determineDataTypes("c"));
	        System.out.println(determineDataTypes("derp"));
	        //}
	    }
	    
	    public static String determineDataTypes(String dataType) {
	    	 try {
		            int intVal = Integer.parseInt(dataType);
		            return "Primitive : Integer";
		        } catch (Exception e) {
		            
		        }
	    	
	    	try{
	            double floatVal = Double.parseDouble(dataType);
	            return "Primitive : Double";
	        } catch(Exception ex) {
	            
	        }
	        
	        
	        try{
	            //boolean boolVal = Boolean.parseBoolean(dataType);
	        	if(dataType.equals("true") || dataType.equals("false"))
	            return "Primitive : Boolean";
	        } catch (Exception e) {
	            
	        }
	        
	        try{ 
	            if(dataType.length() == 1)
	            return "Primitive : Character";
	        } catch(Exception e) {
	            
	        }
	        
	        return "Referenced : String";
	        
	    }

}
