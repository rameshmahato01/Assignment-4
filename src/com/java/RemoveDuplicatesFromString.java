package com.java;

public class RemoveDuplicatesFromString {

	    public static String removeDuplicates(String str) {
	        // Create a character array from the string
	        char[] chars = str.toCharArray();
	        
	        // Create a boolean array to mark duplicate characters
	        boolean[] isDuplicate = new boolean[256]; // Assuming ASCII characters
	        
	        // Create a string builder to store the result
	        StringBuilder result = new StringBuilder();
	        
	        // Iterating each character in array
	        for (int i = 0; i < chars.length; i++) {
	            char ch = chars[i];
	            
	            // Checking the duplicates
	            if (!isDuplicate[ch]) {
	                // If it's not a duplicate, mark it as seen
	                isDuplicate[ch] = true;
	                
	                // Append  character to the result string
	                result.append(ch);
	            }
	        }
	        
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        // Example usage
	        String inputString = "ramesh, mohit!";
	        System.out.println("String without removed duplicates: " + inputString);
	        String resultString = removeDuplicates(inputString);
	        System.out.println("String afer removed duplicates: " + resultString);
	    }
	}


