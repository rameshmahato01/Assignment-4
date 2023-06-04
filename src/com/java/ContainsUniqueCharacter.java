package com.java;

public class ContainsUniqueCharacter {

	    public static boolean hasUniqueCharacters(String str) {
	        // Create a boolean array to mark the occurrence of each character
	        boolean[] characters = new boolean[256]; // Assuming ASCII characters
	        
	        // Iterating each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            if (characters[ch]) {
	                return false;
	            }
	            
	            // Mark the occurrence of the character
	            characters[ch] = true;
	        }
	        
	        return true;
	    }

	    public static void main(String[] args) {
	        String inputString = "hello, everyone...";
	        
	        if (hasUniqueCharacters(inputString)) {
	            System.out.println("The string contains all unique characters.");
	        } else {
	            System.out.println("The string does not contain all unique characters.");
	        }
	    }
	}


