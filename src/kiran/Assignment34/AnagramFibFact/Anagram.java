package kiran.Assignment34.AnagramFibFact;

import java.util.Arrays;

public class Anagram {
	static void isAnagram(String str1, String str2)   
	{      
	boolean status = true;     
	if (str1.length() != str2.length())   
	{         
	status = false;    
	}   
	else   
	{    
	char[] arr1 = str1.toLowerCase().toCharArray();    
	char[] arr2 = str2.toLowerCase().toCharArray();      
	Arrays.sort(arr1);    
	Arrays.sort(arr2);      
	status = Arrays.equals(arr1, arr2);    
	}    
	if (status)   
	{         
	System.out.println(str1 + " and " + str2 + " are anagrams");    
	}   
	else   
	{       
	System.out.println(str1 + " and " + str2 + " are not anagrams");    
	}    
	}     
	public static void main(String args[])   
	{        
	isAnagram("HEART", "EARTH");    
	isAnagram("TRIANGLE", "INTEGRAL");    
	isAnagram("TOSS", "SHOT");   
	}    

}
