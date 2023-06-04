package com.java;

public class PrintDuplicateCharacterFromString {
	    public static void printDuplicates(String str) {
	        // Create an array to store the count of each character
	        int[] count = new int[256]; // Assuming ASCII characters
	        
	        // Convert the string to Lowercase(optional, case-sensitive)
	        str = str.toLowerCase();
	        
	        // Iterate over each character in the string and count its occurrence
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            count[ch]++;
	        }
	        
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            // Check if the character has count greater than 1
	            if (count[ch] > 1) {
	                System.out.print(ch + " ");
	                count[ch] = 0;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        // Example usage
	        String inputString = "Ramesh, Rajesh";
	        System.out.println("Inputs characters are: "+inputString);
	        System.out.print("Duplicate characters are: ");
	        printDuplicates(inputString);
	    }
	}


