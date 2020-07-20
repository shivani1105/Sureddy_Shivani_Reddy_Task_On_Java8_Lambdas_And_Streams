package com.java8lambdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyInterface{  
    void display();  
} 
public class Palindromes {
	
    public void myMethod(){  
	   List<String> list=Arrays.asList("madam","dad","note","date","pop");
	   List<String> newList=new ArrayList<String>();
	   for(String s : list) {
		    String reverse="";
			for (int i = s.length()- 1 ; i >= 0 ; i--)
		    reverse = reverse + s.charAt(i);
			if(s.equalsIgnoreCase(reverse))
				newList.add(s);
			else
				continue;
	   }
	   for(String s: newList) {
		   System.out.println(s);
	   }
    }  
    public static void main(String[] args) {  
	Palindromes obj = new Palindromes();   
	// Method reference using the object of the class
	MyInterface ref = obj::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
    }

}
