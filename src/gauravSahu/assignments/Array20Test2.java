package gauravSahu.assignments;

public class Array20Test2 {

	char getmiddlechar(String name) {
		int length = name.length();
		int index = 0;
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length;
		}
		return name.charAt(index);
	}

	char[] getString(String[] name) {
		int length = name.length;
		char[] charstr = new char[length];
		for (int index = 0; index < length; index++) {
			charstr[index] = getmiddlechar(name[index]);
		}
		return charstr;
	}

	public static void main(String[] args) {
		Array20Test2 a1 = new Array20Test2();
		String[] name = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char[] name1 = a1.getString(name);
		
	}

}

/*
 * Write a method to return middle character of each elements from given array.
 * input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"} output : Mahesh
 * -> h Avni -> v Harshal -> s Aditty -> i Rahul -> h
 */