/*Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits*/

package gauravSahu.Practice;

import java.util.Scanner;

public class practice {
	
	void getMax(String[] word) {
		String maxWord = " ";
		for(int i=0;i<word.length;i++) {
			int length = maxWord.length();
			int newlength = word[i].length();
			if(length<newlength) {
				maxWord = word[i];
			}
		}System.out.println(maxWord);
		
	}
	
	public static void main(String[] args) {
		practice p = new practice();
		System.out.println("Give Input");
		String input = "Good morning friends this is technocredits";
		String[] arr = input.split(" ");
			p.getMax(arr);
		
	}

}
