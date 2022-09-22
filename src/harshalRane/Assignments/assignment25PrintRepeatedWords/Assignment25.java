package harshalRane.Assignments.assignment25PrintRepeatedWords;

import java.util.Arrays;

public class Assignment25 {

	void printAllRepeatedWords(String name) {
		String[] input = name.split(" ");

		System.out.println("Duplicate Names in given string are: \n" + Arrays.toString(input) + "\n");

		for (int index = 0; index < input.length; index++) 
		{
			for (int i = index + 1; i < input.length; i++) 
			{
				if ((input[index].equals(input[i])) && (index != i))
					System.out.println(input[i]);
			}
		}
	}

	void printAllNonRepeatedWords(String name) {
		String[] input = name.split(" ");

		System.out.println("Non duplicate Names in given string are: \n" + Arrays.toString(input) + "\n");

		for (int index = 0; index < input.length; index++)
		{
			boolean flag = true;
			for (int i = 1; i < input.length; i++) 
			{
				if ((input[index].equals(input[i])) && (index != i))
					flag = false;
			}
			if (flag)
				System.out.println(input[index]);
		}
	}

	public static void main(String[] args) {
		String input = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		Assignment25 assignment25 = new Assignment25();
		assignment25.printAllRepeatedWords(input);
		System.out.println("-----------------");
		assignment25.printAllNonRepeatedWords(input);
	}
}
