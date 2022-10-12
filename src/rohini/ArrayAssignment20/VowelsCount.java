package rohini.ArrayAssignment20;

import java.util.Arrays;

//Assignment-20
//Program 5: Return count of Vowels in given String
public class VowelsCount {

	int getCountOfVowels(String input) {
		int count = 0;
		String name = input.toLowerCase();
		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == 'a' | name.charAt(i) == 'e' | name.charAt(i) == 'i' | name.charAt(i) == 'o'
					| name.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
//Program 6: Write a method to count vowels of each name in giver array
	void getVowelsCountFromArray(String[] inputArray) {
		int[] output = new int[inputArray.length];
		for (int index = 0; index < inputArray.length; index++) {
			output[index] = getCountOfVowels(inputArray[index]);
			System.out.println(inputArray[index] + "->" + output[index]);
		}
	}
//Program 7: Write a method to return name having maximum length
	String getmaxLength(String[] input) {
		int maxLength = 0;
		int indexMax = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() > maxLength) {
				maxLength = input[index].length();
				indexMax = index;
			}

		}
		return input[indexMax];
	}
	public static void main(String[] args) {
		String name1 = "MaUlik";
		System.out.println("Input: " + name1 + "\nNumber of Vowels: " + new VowelsCount().getCountOfVowels(name1));
		String[] name2 = { "Ashish", "Aditty", "Rohini", "Manjiri" };
		System.out.println("Input Array: " + Arrays.toString(name2));
		VowelsCount v = new VowelsCount();
		v.getVowelsCountFromArray(name2);
		String[] name3 = { "Aditty", "Credits", "Rohini", "Manjiri" };
		System.out.println("Input Array: " + Arrays.toString(name3));
		System.out.println("Name having maximum length from given Array:" + new VowelsCount().getmaxLength(name3));
	}
}
