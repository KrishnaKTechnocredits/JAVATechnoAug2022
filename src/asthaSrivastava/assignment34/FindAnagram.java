/*Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram
*/
package asthaSrivastava.assignment34;

import java.util.Arrays;

public class FindAnagram{
	//method 2 for Anagram
	boolean isAnagram(){
		String str1 = "catc";
		String str2 = "actc";
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int index =0;index<arr1.length;index++){
			if(arr1[index]!= arr2[index]){
				return false;
			}
		}
		System.out.println("Given input is Anagram");
		return true;
		}
	
	public static void main(String[] args) {
		new FindAnagram().isAnagram();
	}
}		
		