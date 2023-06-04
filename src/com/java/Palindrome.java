package com.java;

public class Palindrome {
	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;
	        
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        
	        return true;
	    }

	    public static void main(String[] args) {
	        String inputString = "2552";
	        
	        if (isPalindrome(inputString)) {
	            System.out.println(inputString + " is a palindrome.");
	        } else {
	            System.out.println(inputString + " is not a palindrome.");
	        }
	    }
	}


