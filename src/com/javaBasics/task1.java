package com.javaBasics;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
     
		/*Write a java program to print your information
		 * (name, graduation, from where, contactNO) using Scanner class.*/
		
         Scanner scanner = new Scanner(System.in);
         
         /*scanner is a class from java.util package,
 		 * it is used to read the value form the user/keyboard
 		 */
 		
        
        // read user information
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        // scanner.nextLine(); is use to read an entire line or used to read user input 
        
        System.out.println("Enter graduation: ");
        String graduation = scanner.nextLine();
        
        System.out.println("Enter from where you are: ");
        String place = scanner.nextLine();
        
        System.out.println("Enter contact number: ");
        String contact = scanner.nextLine();
        
        // Print the user information
        
        System.out.println("Name: " + name);
        System.out.println("Graduation: " + graduation);
        System.out.println("From where: " + place);
        System.out.println("Contact Number: " + contact);
        
        // Close the scanner
        scanner.close();
    


	}

}
