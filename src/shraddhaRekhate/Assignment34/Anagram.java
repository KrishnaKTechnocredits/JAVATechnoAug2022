package shraddhaRekhate.Assignment34;

import java.util.Arrays;

//Program 1 : How to check if two given String is the anagram of each other (using scanner class)?
//
//Input1: catc
//Input2: actc
//
//Output: anagram

public class Anagram {
	
	boolean isAnagram(String str1,String str2) {
		
		//convert string to lowercase
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		//convert string to char array
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		//sort array
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//for loop
		for(int index=0;index<arr1.length;index++) {
			if(arr1[index]!=arr2[index]) {
			   return false;
			}
		}
		return true;
	}

	
	public static void main(String[] args) {
		Anagram anagram=new Anagram();
		boolean flag=anagram.isAnagram("catc", "actc");
		if(flag==true)
			System.out.println("output: anagram");
		else
			System.out.println("output: not anagram");
	}

}
