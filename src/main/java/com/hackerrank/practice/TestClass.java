package com.hackerrank.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String[] numberStrArray = br.readLine().split("\\s+");
            int numberWords = Integer.parseInt(numberStrArray[0]);
            int numO = Integer.parseInt(numberStrArray[1]);
            int numZ = Integer.parseInt(numberStrArray[2]);
            
            List<MyString> list = new ArrayList<>();
            
            for(int j = 0; j < numberWords; j++) {
            	String[] wordsArr = br.readLine().split("\\s+");
            	for(String word:wordsArr) {
            		
            		int localO = 0, localZ = 0;
            		
            		for(Character ch : word.toCharArray()) {
            			if(ch == 'O' || ch == 'o') {
            				localO++;
            			} else {
            				localZ++;
            			}
            		}
            		
            		MyString obj = new TestClass().new MyString();
            		obj.countO = localO;
            		obj.countZ = localZ;
            		obj.word = word;
            		
            		list.add(obj);
            	}
            }
            
            int countO = numO, countZ = numZ;
            Comp comp = null;
            
            if(numO>numZ) {
            	comp = new TestClass().new Comp("O", "Z");
            } else {
            	comp = new TestClass().new Comp("Z", "O");
            }
            
            Collections.sort(list, comp);
            
            int counter = 0;
            i = 0;
            while((countO > 0 || countZ > 0) && i < list.size() ) {
            	MyString myObj = list.get(i++);
            	countO = countO - myObj.countO;
            	countZ = countZ - myObj.countZ;
            	if(countO > 0 || countZ > 0) counter++;
            }
            
            
            System.out.println(counter);
            
        }

    }
    
    class MyString{
    	int countO;
    	int countZ;
    	String word;
    }
    
    class Comp implements Comparator<MyString> {

    	String prior1;
    	String prior2;
    	
    	public Comp(String prior1, String prior2) {
    		this.prior1 = prior1;
    		this.prior2 = prior2;
    	}
    	
		@Override
		public int compare(MyString o1, MyString o2) {
			if(prior1.equals("O")) {
				if(o1.countO>o2.countO) {
					return 1;
				} else if(o1.countO<o2.countO){
					return -1;
				} else {
					//return 0;
					if(o1.countZ > o2.countZ) {
						return 1;
					} else if(o2.countZ < o2.countZ) {
						return -1;
					} else {
						return 0;
					}
				}
			}
			
			if(o1.countZ>o2.countZ) {
				return 1;
			} else if(o1.countZ<o2.countZ){
				return -1;
			} else {
				//return 0;
				if(o1.countO > o2.countO) {
					return 1;
				} else if(o2.countO < o2.countO) {
					return -1;
				} else {
					return 0;
				}
			}
			//return 0;
		}
    	
    }
}
