/*Test - 3 : 10th Sep'2022

Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c

Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Puja -> u
              Harshal -> s
              Aditty -> i
              Rahul -> h


2nd problem : 

char[] getMiddleCharFromName(String[] arr){
}

char[] ch = new char[arr.length];

sop(input[0] + "->" + output[0])

sop(input[index] + "->" + output[index])
*/

package pankajBhatt;

public class Test3_10_Sep2022 {
	
	char getMiddleCharOfMaxLengthStringFromArray(String[] arr) {
		char midChar = 0;
		String maxString = "";
		int maxLength = arr[0].length();
		for(int i = 0; i < arr.length; i++ ) {
			if(arr[i].length() > maxLength) {
				maxString = arr[i];
			}
		}
		if(maxString.length() % 2 == 0) {
			midChar = maxString.charAt(maxString.length() /2 - 1);
		}else {
			midChar = maxString.charAt(maxString.length() /2);
		}
		return midChar;
	}

	String[] getMiddleCharOfEachElementsFromArray(String[] arr) {
		String[] outputArr = new String[arr.length];
		for(int i = 0; i < arr.length; i++ ) {
			if(arr[i].length() % 2 == 0) {
				outputArr[i] = arr[i] + " -> " + arr[i].charAt(arr[i].length() / 2 - 1);
			}else {
				outputArr[i] = arr[i] + " -> " +  arr[i].charAt(arr[i].length() / 2);
			}
		}
		return outputArr;
	}
	
	public static void main(String[] args) {
		Test3_10_Sep2022 test3_10_Sep2022 = new Test3_10_Sep2022();
		String [] input1 = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		System.out.println(test3_10_Sep2022.getMiddleCharOfMaxLengthStringFromArray(input1));
		String[] input2 = {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		String[] outputString = test3_10_Sep2022.getMiddleCharOfEachElementsFromArray(input2);
		for (int i = 0; i < outputString.length; i++) {
			System.out.println(outputString[i]);
		}
	}
}
