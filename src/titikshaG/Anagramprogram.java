//Program 1 : How to check if two given String is the anagram of each other (using scanner class)?
//Input1: catc
//Input2: actc
//Output: anagram

package titikshaG;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramprogram {

//Method 1-Using sort method
	public static boolean isAnagram(String str1,String str2) {
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int index=0;index<arr1.length;index++) {
			if(arr1[index]!=arr2[index])
				return false;}
		return true;
	}
	
//Method 2-using replace method
	public static void isAnagram2(String str1,String str2) {
		if(str1.length() !=str2.length()){
			System.out.println("Not a anagram");}
		else {
			while(str1.length()>0) {
				char ch=str1.charAt(0);
				str1=str1.replaceFirst(String.valueOf(ch), "");
				str2=str2.replaceFirst(String.valueOf(ch), "");}
			if(str1.length()==str2.length()) {
				System.out.println("Anagram string");}
			else {
				System.out.println("Are not aragaram string");}
				
		}
	}
	
//Program 2 : Write a method to return factorial of user defined given number (using scanner class).
//input : 5
//output : 120  
	
	public static int getFactorial(int num){
		int index; int factorial=1;
		for(index=1;index<num;index++) {
			factorial=factorial*index;}
			return factorial;}

	
	public static void main(String[] args){
// create an object of Scanner class
			Scanner input=new Scanner(System.in);
// take input from users
			System.out.println("Enter String 1:");
			String str1=input.nextLine();
			System.out.println("Enter String 2:");
			String str2=input.nextLine();
			if(isAnagram(str1, str2))
	            System.out.println(str1+" and "+str2+" are Anagrams");
	        else
	            System.out.println(str1+" and "+str2+" are NOT Anagrams");
	        
	        input.close();
	        
	        System.out.println();
	        System.out.println("------------------Anagram method 2 Output------------------");
	        System.out.println("String one: catc");
	        System.out.println("String Two: actc");
	        Anagramprogram.isAnagram2("catc","actc");
	        
	        System.out.println();
	        
	        System.out.println("String one: Techno");
	        System.out.println("String Two: Hecnotg");
	        Anagramprogram.isAnagram2("Techno","Hecnotg");}
 
	}
	        
	       
	   
	     

		
