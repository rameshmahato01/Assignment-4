package com.java;

public class Pangram {
	    public static boolean isPangram(String str) {
	        // Create a boolean array to mark the occurrence of each letter
	        boolean[] letters = new boolean[26];
	        
	        // Convert the string to lowercase (optional, case-insensitive)
	        str = str.toLowerCase();
	        
	        // Iterating each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            // Check if character is a letter between 'a' and 'z'
	            if (ch >= 'a' && ch <= 'z') {
	                letters[ch - 'a'] = true;
	            }
	        }
	        
	        // Check if all letters are present
	        for (boolean letter : letters) {
	            if (!letter) {
	                return false;
	            }
	        }
	        
	        return true;
	    }

	    public static void main(String[] args) {
	        String inputString = "The quick brown fox jumps over the lazy dog";
	        
	        if (isPangram(inputString)) {
	            System.out.println("The string is a pangram.");
	        } else {
	            System.out.println("The string is not a pangram.");
	        }
	    }
	}


