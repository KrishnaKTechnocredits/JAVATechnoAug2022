package manjiri.arrayEx;

import java.util.Arrays;

public class ArrayEx14 {
	
/*****************Print all the repeated word in given string.****************/
//	String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
//	output : Hindavi 
//	         Shubham 
/*****************************************************************************/

	void PrintRepeatedWords(String input) {
		String[] stringArr = input.split(" ");

		System.out.println("Input array is: " + Arrays.toString(stringArr));
		System.out.println("Duplicate names are: ");
		for (int index = 0; index < stringArr.length; index++) {
			for (int i = index + 1; i < stringArr.length; i++) {
				if (stringArr[index].equals(stringArr[i]) && (index != i)) {
					System.out.println(stringArr[index]);
				}
			}
		}
	}
	
/******************Print all the non repeated word in given string.******************/
//	String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
//	output : Maulik
//			 Puja
//			 Titiksha
//			 Swati
/***********************************************************************************/

	void PrintNonRepeatedWords(String input) {
		String[] stringArr = input.split(" ");
		System.out.println("Input array is: " + Arrays.toString(stringArr));
		System.out.println("Non Repeated names are: ");
		for (int index = 0; index < stringArr.length; index++) {
			int count = 0;
			for (int i = 0; i < stringArr.length; i++) {
				if (stringArr[index].equals(stringArr[i]) && (index != i)) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(stringArr[index]);
			}
		}
	}

	public static void main(String[] args) {
		String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";

		ArrayEx14 arrayEx14 = new ArrayEx14();
		arrayEx14.PrintRepeatedWords(str);
		arrayEx14.PrintNonRepeatedWords(str);
	}
}
