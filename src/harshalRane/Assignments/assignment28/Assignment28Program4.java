/*
 * Program 4: [15 mins]
Print count of each vowels in a given String Array using switch case.

input : {"technocredits", "swati", "aashvi"}
output : vowel count in technocredits:
		 e -> 2
         o -> 1
		 i -> 1
		 vowel count in swati:
		 a -> 1
         i -> 1
		 vowel count in aashvi:
		 a -> 2
         i -> 1
 */

package harshalRane.Assignments.assignment28;

import java.util.Arrays;

public class Assignment28Program4 extends Assignment28Program3{
	
	void getVovelsArray(String[] input) {
		
		for(int index=0;index<input.length;index++) {
			getVovels(input[index]);
			System.out.println("----------------");
			}
	}
	
	
	public static void main(String[] args) {
		Assignment28Program4 assignment28 = new Assignment28Program4();
		String [] input = {"technocredits", "swati", "aashvi"};
		System.out.println("Count of vowel in given String "+ "\""+Arrays.toString(input)+ "\""+ " is: ");
		assignment28.getVovelsArray(input);
	}
}
