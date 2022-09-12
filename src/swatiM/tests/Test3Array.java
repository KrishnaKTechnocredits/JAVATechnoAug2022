
/*Test - 3 : 10th Sep'2022
Program 1 : (20 mins)
Return middle character of max length String from given array. 
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c

Program 2: (40 mins)
Write a method to return middle character of each elements from given array. 
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h Avni -> v Harshal -> s Aditty -> i Rahul -> h
2nd problem : char[] getMiddleCharFromName(String[] arr){ }
char[] ch = new char[arr.length];
sop(input[0] + "->" + output[0])
sop(input[index] + "->" + output[index])*/

package swatiM.tests;

import java.util.Arrays;

public class Test3Array {

	char getMiddleCharOfMaxLengthString(String[] inputArray) {
		int maxLength = inputArray[0].length();
		int strIndex = 0;
		char outputChar = ' ';

		for (int index = 0; index < inputArray.length; index++) {
			int stringLength = inputArray[index].length();

			if (maxLength < stringLength) {
				maxLength = inputArray[index].length();

				if (maxLength % 2 == 0) {
					strIndex = maxLength / 2 - 1;
				} else {
					strIndex = maxLength / 2;
				}
				outputChar = inputArray[index].charAt(strIndex);
			}
		}
		return outputChar;
	}

	char[] getMiddleCharOfArrayElement(String[] inputArray) {
		int strIndex = 0;
		char[] outputArray = new char[inputArray.length];

		for (int index = 0; index < inputArray.length; index++) {
			int strLength = inputArray[index].length();
			if (strLength % 2 == 0) {
				strIndex = strLength / 2 - 1;
				outputArray[index] = inputArray[index].charAt(strIndex);
			} else {
				strIndex = strLength / 2;
				outputArray[index] = inputArray[index].charAt(strIndex);
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {

		Test3Array program1 = new Test3Array();
		String[] inputArray = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		char outputChar = program1.getMiddleCharOfMaxLengthString(inputArray);

		System.out.println("Input Array: " + Arrays.toString(inputArray));
		System.out.println("Middle character of max length string: " + outputChar);

		Test3Array program2 = new Test3Array();

		String[] arr = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char[] opArray = program2.getMiddleCharOfArrayElement(arr);

		System.out.println("Input Array: " + Arrays.toString(arr));
		System.out.println("\nMiddle characters of each element:");
		for (int index = 0; index < opArray.length; index++) {
			System.out.println(arr[index] + " -> " + opArray[index]);
		}

	}
}
