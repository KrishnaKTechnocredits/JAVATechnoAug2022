/*
Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h*/

package smitaVetal;

import java.util.Arrays;

public class ArrayHandling2 {

	char[] getMiddleChar(String[] inputArray) {
		int startIndex = 0;
		char[] outputArray = new char[inputArray.length];

		for (int index = 0; index < inputArray.length; index++) {
			int strlength = inputArray[index].length();
			if (strlength % 2 == 0) {
				startIndex = strlength / 2 - 1;
				outputArray[index] = inputArray[index].charAt(startIndex);
			} else {
				startIndex = strlength / 2;
				outputArray[index] = inputArray[index].charAt(startIndex);
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		ArrayHandling2 array = new ArrayHandling2();
		String[] arr1 = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char[] ch = array.getMiddleChar(arr1);
		System.out.println("Input Array - " + Arrays.toString(arr1));
		System.out.println("Output Array - ");
		for (int index = 0; index < arr1.length; index++) {
			System.out.println(arr1[index] + " - " + ch[index]);
		}
	}
}