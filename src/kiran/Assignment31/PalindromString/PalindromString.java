package kiran.Assignment31.PalindromString;

import java.util.Arrays;


public class PalindromString {
	void getPalindromString(String str) {
		//System.out.println(str);
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println(str+"-> is palinndrom");
		else
			System.out.println(str+"-> is not palinndrom");
	}

	void getPalindromStringsInArray(String[] str) {
		System.out.println("Given String : "+Arrays.toString(str));
		for(int i=0;i<str.length;i++) {
				getPalindromString(str[i]);
		}
	}
	public static void main(String[] args) {
		PalindromString obj=new PalindromString();
		//String input="radar";
		obj.getPalindromString("radar");
		obj.getPalindromString("aabcbaa");
		obj.getPalindromString("abcabc");
		System.out.println();
		String[] input2={"radar","techhpet","madam","maulikkilum"};
		obj.getPalindromStringsInArray(input2);

	}

}
