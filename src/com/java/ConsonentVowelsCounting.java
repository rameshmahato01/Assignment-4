package com.java;

public class ConsonentVowelsCounting {
	    public static void countCharacters(String str) {
	        int vowelsCount = 0;
	        int consonantsCount = 0;
	        int specialCharsCount = 0;
	        
	        // Convert the string to lowercase (optional, case-insensitive)
	        str = str.toLowerCase();
	        
	        // Iterate over each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            // Check if the character is a letter
	            if ((ch >= 'a' && ch <= 'z')) {
	                // Check if the character is a vowel
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowelsCount++;
	                } else {
	                    consonantsCount++;
	                }
	            } else {
	                specialCharsCount++;
	            }
	        }
	        
	        System.out.println("Vowels are :: " + vowelsCount);
	        System.out.println("Consonants are :: " + consonantsCount);
	        System.out.println("Special characters are :: " + specialCharsCount);
	    }

	    public static void main(String[] args) {
	        String inputString = "ramesh, mohit,pintu";
	        countCharacters(inputString);
	    }
	}


