package com.hackerrank.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class StackApplication1 {
	public static void main(String []argh)
	   {
	      Scanner sc = new Scanner(System.in);
	       Map<Character, Character> map = new HashMap<Character, Character>();
	       map.put('}','{');
	       map.put(')','(');
	       map.put(']','[');
	       
	      Set<Character> opening = new HashSet<Character>();
	       opening.add('(');
	       opening.add('{');
	       opening.add('[');
	       
	      Set<Character> closing = new HashSet<Character>();
	       closing.add(')');
	       closing.add('}');
	       closing.add(']');
	       
	       Stack<Character> stack = new Stack<Character>();
	       
	      while (sc.hasNext()) {
	    	 stack = new Stack<Character>();
	         String input=sc.next();
	          if(input == null || input.trim().isEmpty()) {
	              System.out.println(false);
	              continue;
	          }
	          boolean flag = true;
	          for(int i =0; i < input.length(); i++) {
	                 char str = input.charAt(i);
	                 if(opening.contains(str)) {
	                     stack.push(str);
	                 }

	                 if(closing.contains(str)) {
	                	 if(stack.isEmpty()) {
	                		 flag = false;
	                		 break;
	                	 }
	                     Character elem = stack.pop();
	                     if(!elem.equals(map.get(str))) {
	                    	 flag = false;
	                         break;
	                     }
	                 }
	          }
	          
	          if(flag){
	        	  System.out.println(stack.isEmpty());
	          } else {
	        	  System.out.println(flag);
	          }
	      }
	       
	      
	   }

}
