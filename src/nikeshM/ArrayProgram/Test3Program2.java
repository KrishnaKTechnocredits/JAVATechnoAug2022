package nikeshM.ArrayProgram;

//Program 2: (40 mins)
//Write a method to return middle character of each elements from given array.
//input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
//output : Mahesh -> h
//              Avni -> v
//              Puja -> u
//              Harshal -> s
//              Aditty -> i
//              Rahul -> h

public class Test3Program2 {
	char getMiddleCharName(String name) {
		int length = name.length();
		char ch = 0;
		if (length % 2 == 0) {
			length = length / 2 - 1;
		} else {
			length = length / 2;
		}
		ch = name.charAt(length);
		return ch;
	}

	String printMiddleName(String[] name) {
		String str = "";
		for (int index = 0; index < name.length; index++) {
			char ch = getMiddleCharName(name[index]);
			System.out.println(name[index] + ":" + ch);
		}

		return str;
	}

	public static void main(String[] args) {
		String[] input = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		new Test3Program2().printMiddleName(input);
	}
}
