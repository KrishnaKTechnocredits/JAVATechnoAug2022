package technocredits.inteview;

import java.util.Arrays;

public class AnagramExample {

	boolean isAnagram() {
		String str1 = "abtcbt";
		String str2 = "bbtcat";
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int index=0;index<arr1.length;index++) {
			if(arr1[index] != arr2[index])
				return false;
		}
		return true;
	}
	
	boolean isAnagram2() {
		String str1 = "abtcbt";
		String str2 = "bbtcat";
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(Arrays.toString(arr1).equals(Arrays.toString(arr2)));
		return Arrays.toString(arr1).equals(Arrays.toString(arr2));
	}
	
	void isAnagram1(String str1, String str2) {
		if(str1.length() != str2.length()) {
			System.out.println("Not an anagram");
		}else {
			while(str1.length() > 0) {
				char ch = str1.charAt(0);
				str1 = str1.replaceFirst(String.valueOf(ch), "");
				str2 = str2.replaceFirst(String.valueOf(ch), "");
			}
			if(str1.length() == str2.length())
				System.out.println("Anagram String");
			else
				System.out.println("Not an anagram string");
		}
	}

	public static void main(String[] args) {
		String str1 = "abtcbtt";
		String str2 = "btcaat";
		new AnagramExample().isAnagram2();
		
		String[] arr = {"Hi","Hello","Maulik"};
		String output = String.join("-",arr);
		System.out.println(output);
	}
}
