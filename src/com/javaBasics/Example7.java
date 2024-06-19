package com.javaBasics;

public class Example7 {

	public static void main(String[] args) {
       
		//write a java program to calculate sum of two numbers
		// NOTE read value from command-line argument
		
		int value1 = Integer.parseInt(args[0]);
		int value2 = Integer.parseInt(args[1]);
		
		/*int sum = 0;
		 * sum = v1 + v2
		 * can also do by above lines  
		 */
		
		
		int sum = value1+value2;
		
		System.out.println(sum);
		
		//run as run configuration
	}

}
