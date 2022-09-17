/*Assignment - 20 : 10th Sep'2022
5) Return count of vowels in a given String.
input : maulik
output : 3

6) Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
		 
7) Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits
*/

package deepakPatil.Assignment20ArrayExamples;

import java.util.Arrays;

public class ArrayAssignment20_3 {

	boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		else
			return false;
	}

	int getCountOfOvwels(String name) {
		name = name.toLowerCase();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (isVowel(name.charAt(i)))
				count++;
		}
		return count;
	}

	int[] getOvelCountFromEachString(String[] nameArr) {
		int[] count = new int[nameArr.length];

		for (int i = 0; i < nameArr.length; i++) {
			count[i] = getCountOfOvwels(nameArr[i]);
		}

		return count;
	}
	
	String getNameOfMaxLength(String[]name) {
		int maxNameLength= name[0].length();
		String maxLengthName=name[0];
		
		for(int i=1;i<name.length;i++) {
			if(name[i].length()>= maxNameLength) {
				maxNameLength=name[i].length();
				maxLengthName=name[i];
			}
		}
		return maxLengthName;
	}
	
		

	public static void main(String[] args) {
		ArrayAssignment20_3 arrayAssignment20_3 = new ArrayAssignment20_3();

		String name = "Maulik";
		System.out.println("Vowels count in " + name + " is " + arrayAssignment20_3.getCountOfOvwels(name));

		String[] input = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		System.out.println("\nGiven array is " + Arrays.toString(input));
		System.out.println("--Vowels from each String from given array--");
		int[] coutnOfVowels = arrayAssignment20_3.getOvelCountFromEachString(input);
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i] + "->" + coutnOfVowels[i]);
		}
		
		String[]input1 ={"Ashish","Aditty","Manjiri","Ankita","Credits"};
		System.out.println("\nGiven array is " +Arrays.toString(input1));
		System.out.println("Maximum length name from given array is "+arrayAssignment20_3.getNameOfMaxLength(input1));
	}

}
