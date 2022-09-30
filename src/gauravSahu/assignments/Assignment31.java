/*Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom*/
package gauravSahu.assignments;

import java.util.Arrays;

public class Assignment31 {

	boolean getPallindrom(String name) { // "radar","aabcbaa","abcabc"
		boolean flag = true;
		for (int i = 0, j = name.length() - 1; i < j; i++, j--) {
			if (name.charAt(i) != name.charAt(j)) {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Assignment31 a31 = new Assignment31();
		String[] arr = { "radar", "aabcbaa", "abcabc" };
		System.out.println("Given name array is : "+ Arrays.toString(arr));
		for (String name : arr) {
			boolean flag = a31.getPallindrom(name);
			if (flag) 
				System.out.println("It is a pallindrom string : " +  name);
			if(flag == false)
				System.out.println("It is not a pallindrom string : " +  name);
		}
	}
}
