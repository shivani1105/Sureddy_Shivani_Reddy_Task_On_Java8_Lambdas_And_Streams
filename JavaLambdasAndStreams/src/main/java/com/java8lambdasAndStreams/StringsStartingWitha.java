package com.java8lambdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringsStartingWitha {
    
	public static List<String> checkString(List<String> list) {
		List<String> newList=new ArrayList<String>();
		String str="a";
		for(String s : list) {
			if(s.startsWith(str) && s.length()==3)
				newList.add(s);
			else
				continue;
		}
		return newList;
	}
	 public static void main(String args[]) {
		 List<String> list=Arrays.asList("abc","asd","bcd","dfghjk","aaaaa","","ab");
		 List<String> result=checkString(list);
		 if(result.size()>0) {
			 for(int i=0;i<result.size();i++){
				    System.out.println(result.get(i));
				}
		 }
		 else {
			 System.out.println("No such strings exist");
		 }
	 }
	
}
