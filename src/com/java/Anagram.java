package com.java;

public class Anagram {
	    public static boolean isAnagram(String str1, String str2) {
	        // Convert the strings to lowercase (optional, case-insensitive)
	        str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();
	        
	        // Create an array to store  each letter
	        int[] letters = new int[26];
	        
	        // Iterating characters in the first string
	        for (int i = 0; i < str1.length(); i++) {
	            char ch = str1.charAt(i);
	            
	            // Check if the character is a letter (between 'a' and 'z')
	            if (ch >= 'a' && ch <= 'z') {
	                letters[ch - 'a']++;
	            }
	        }
	        
	        // Iterating characters in the second string
	        for (int i = 0; i < str2.length(); i++) {
	            char ch = str2.charAt(i);
	            
	            // Check if the character is a letter (between 'a' and 'z')
	            if (ch >= 'a' && ch <= 'z') {
	                letters[ch - 'a']--;
	            }
	        }
	        
	        // Check if all counts are zero
	        for (int count : letters) {
	            if (count != 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }

	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";
	        
	        if (isAnagram(str1, str2)) {
	            System.out.println("The strings are anagrams.");
	        } else {
	            System.out.println("The strings are not anagrams.");
	        }
	    }
	}


