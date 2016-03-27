package com.hackerrank.practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class MaxMin {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      Comparator<Student> comparator = new MaxMin().new StudentComparator();
      PriorityQueue<Student> queue = 
    		  new PriorityQueue<Student>(1000, comparator);
      while(totalEvents>0){
         String event = in.next();
            
           //Complete your code
            //String[] strArray = event.split(" ");
            if(event.equalsIgnoreCase("ENTER")) {
            	String name = in.next();
            	double cgpa = Double.parseDouble(in.next());
            	int token = Integer.parseInt(in.next());
               Student student = new Student(token,name,cgpa);
                queue.add(student);
            } else if (event.equalsIgnoreCase("SERVED")) {
               //System.out.println(queue.peek().getFname());
                //queue.remove();
            	queue.poll();
            }
            totalEvents--;
          }
	      boolean flag=true;
	      while(!queue.isEmpty()){
	          Student st = queue.poll();
	          System.out.println(st.getFname());
	          flag=false;
	      }
	      if(flag){
	          System.out.println("EMPTY");
	      }
      }
    
    
    class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            if(java.lang.Double.compare(student1.getCgpa(),student2.getCgpa()) != 0) {
                return java.lang.Double.compare(student2.getCgpa(),student1.getCgpa());//descending
            } else {
                //check for name
                if(student1.getFname().compareTo(student2.getFname()) != 0) {
                    return student1.getFname().compareTo(student2.getFname());
                } else {
                    return (int) (student1.getToken() - student2.getToken());
                }
            }
      }
    }
}