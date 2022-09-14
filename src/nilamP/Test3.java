

/*
Test - 3 : 10th Sep'2022

Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c

Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h*/

package nilamP;

public class Test3 {

	String getMaxLength(String[] arr) {
		int max = arr[0].length();
		String maxString = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > max) {
				max = arr[i].length();
				maxString = arr[i];

			}
		}
		return maxString;
	}

	char getMidChar(String maxString) {
		int i = 0;
		if (maxString.length() % 2 == 0) {
			i = maxString.length() / 2 - 1;
		} else {
			i = maxString.length() / 2;
		}
		return maxString.charAt(i);
	}

	char getMiddlechar(String str) {

		int index = 0;
		int length = str.length();
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		char ch = str.charAt(index);
		return ch;
	}

	public static void main(String[] args) {
		Test3 t = new Test3();
		String[] arr2 = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		String maxString = t.getMaxLength(arr2);
		char ch = t.getMidChar(maxString);
		System.out.println("Middle character of maximum length string is : " + ch);

		String[] arr1 = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Middle char of " + arr1[i] + " >  " + t.getMiddlechar(arr1[i]));

		}

	}

}

