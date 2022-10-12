package rohini.Assignment34;

//Assignment34
//Program 1 : How to check if two given String is the anagram of each other (using scanner class)
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	void isAnagram(String input1, String input2) {
		String name1 = input1.toLowerCase();
		String name2 = input2.toLowerCase();
		char[] array1 = name1.toCharArray();
		char[] array2 = name2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		if (Arrays.toString(array1).equals(Arrays.toString(array2)))
			System.out.println(input1 + " and " + input2 + " are anagram");
		else
			System.out.println(input1 + " and " + input2 + " are not anagram");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = input.nextLine();
		System.out.println("Enter second string");
		String str2 = input.next();
		new Anagram().isAnagram(str1, str2);
		input.close();

	}

}
