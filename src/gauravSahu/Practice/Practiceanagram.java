package gauravSahu.Practice;

import java.util.Arrays;

public class Practiceanagram {
	
	boolean getAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}return true;
	}
	
	
	
	public static void main(String[] args) {
		Practiceanagram p2 = new Practiceanagram();
		String input1 = "abtcbt";
		String input2 = "bbtcat";
		boolean flag = p2.getAnagram(input1,input2);
		if(flag) {
			System.out.println("It is anagram");
		}else{
			System.out.println();
		}
			
	}

}
