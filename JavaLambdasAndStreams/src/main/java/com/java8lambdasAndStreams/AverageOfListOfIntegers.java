package com.java8lambdasAndStreams;

import java.util.Arrays;
import java.util.List;

public class AverageOfListOfIntegers {
	
	
	  public static float average(List<Integer> list) {
	      int sum = 0;
	      for (int i : list) {
	         sum+=i;
	      }
	      if(list.isEmpty()){
	         return -1;
	      } else {
	         return (sum/(float)list.size());
	      }
	  }
	
	   public static void main(String []args){
		      List<Integer> list= Arrays.asList(10, 20, 50, 100, 130, 150, 200, 250, 500);
		      float result=average(list);
		      if(result==-1){
		         System.out.println("Empty list!");
		      } else {
		         System.out.println("Average = " + result);
		      }
		   }
	
}