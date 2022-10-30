/*Assignment 40 : 16th Oct'2022

Program 3 : Return a reverse String [Method : inplace reverse].*/

package rashmiG.ReverseStringDifferentApproaches;

import java.util.Arrays;

public class ReverseStringUsingInplaceReverse {

	String reverseString(String input) {// technocredits
		char ch1 = ' ', ch2 = ' ';
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			ch1 = input.charAt(i);
			ch2 = input.charAt(j);
			if (i == 0)
				input = ch2 + input.substring(i + 1, j) + ch1;
			else
				input = input.substring(0, i) + ch2 + input.substring(i + 1, j) + ch1 + input.substring(j + 1);
		}
		return input;
	}

	static String reverseStringUsingCharArray(String input) {
		char[] arr = input.toCharArray();// {t ,e,c,h,n,o,c,r,e,d,i,t,s}
		char temp = ' ', ch1 = ' ', ch2 = ' ';
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			ch1 = input.charAt(i);
			ch2 = input.charAt(j);
			temp = ch2;
			ch2 = ch1;
			ch1 = temp;
			arr[i] = temp;
			arr[j] = ch2;
		}
		System.out.println(Arrays.toString(arr));
		return Arrays.toString(arr);
	}

	public static void main(String[] args) {
		System.out.println("Reverse string : " + new ReverseStringUsingInplaceReverse().reverseString("technocredits"));
		// reverseStringUsingCharArray("technocredits");
	}
}