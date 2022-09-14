
/* 
Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h
              */

package swapnilMaheshwari.Test3;

public class MiddleCharFromName {
	int ind = 0;

	char[] getMidCharFromString(String[] name) {
		char[] output = new char[name.length];
		for (int index = 0; index < name.length; index++) {
			int length = name[index].length();
			if (length % 2 == 0) {
				ind = length / 2 - 1;
			} else {
				ind = length / 2;
			}
			output[index] = name[index].charAt(ind);
		}

		return output;
	}

	public static void main(String[] args) {

		String[] input = { "Swapnil", "Mahesh", "Avani", "Technocredits" };
		MiddleCharFromName middleCharFromName = new MiddleCharFromName();
		char[] out = middleCharFromName.getMidCharFromString(input);
		for (int index = 0; index < input.length; index++) {
			System.out.println(input[index] + "->" + out[index]);

		}

	}

}
