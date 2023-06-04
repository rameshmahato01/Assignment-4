package com.java;

public class MaximumOccuringCharacter {
	    public static char getMaxOccurringChar(String str) {
	        // Create an array to store the frequency of each character
	        int[] frequency = new int[256]; // Assuming ASCII characters
	        
	        // Calculate the frequency of each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            frequency[ch]++;
	        }
	        
	        // Find the character with maximum frequency
	        char maxChar = '\0';
	        int maxFreq = 0;
	        
	        for (int i = 0; i < frequency.length; i++) {
	            if (frequency[i] > maxFreq) {
	                maxChar = (char) i;
	                maxFreq = frequency[i];
	            }
	        }
	        
	        return maxChar;
	    }

	    public static void main(String[] args) {
	        String inputString = "ramesh,mohit,rajesh";
	        char maxChar = getMaxOccurringChar(inputString);
	        
	        if (maxChar != '\0') {
	            System.out.println("The maximum occurring character is: " + maxChar);
	        } else {
	            System.out.println("No maximum occurring character found.");
	        }
	    }
	}


