package com.hackerrank.practice.java;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class ReflectionAttributes {

        public static void main(String[] args) throws ClassNotFoundException{
            Class student = Class.forName("com.hackerrank.practice.java.Student");
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m:methods){
                methodList.add(m.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }
}

