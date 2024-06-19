package com.javaBasics;

public class task2 {

	public static void main(String[] args) {
		
		/*Write a java program to calculate the simple interest 
		 * for a given amount 10000, rate of interest is 2.5 and time duration 24 months.
		 * 
		 * Note: read the values from command-line arguments
		 *  
		 *S.I. = (P*R*T)/100
		 *
	     *where P = Principal( initially borrowed amount)
	     *R = Rate of Interest in % per annum,T = Time
	     * Take principal = 10000 Rate =2.5% Time = 2 years  */
		
		  
		int P = Integer.parseInt(args[0]);
		float R = Float.parseFloat(args[1]);
		int T = Integer.parseInt(args[2]);
		
		float SimpleInterest = (P*R*T)/100; 
		
		System.out.println(SimpleInterest); // output for above example is 500 
	}

}
