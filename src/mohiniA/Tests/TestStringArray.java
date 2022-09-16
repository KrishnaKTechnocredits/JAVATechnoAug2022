
/*****
 * Test - 3 : 10th Sep'2022

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
	              Rahul -> h
 * ******/

package mohiniA.Tests;

public class TestStringArray {

	char getMidCharofMaxString(String[] name) {
		String flag = name[0];
		int x = 0;
		System.out.println("Return middle character of max length String from given Array");
		for (int index = 0; index < name.length; index++) {
			System.out.println("[" + name[index] + "]");
			if (flag.length() < name[index].length())
				flag = name[index];
		}

		if (flag.length() % 2 == 0)
			x = 1;
		else
			x = 0;

		return flag.charAt(flag.length() / 2 - x);

	}

	char[] getMiddCharEachElementArray(String[] name) {
		char[] ch = new char[name.length];
		int x = 0;
		System.out.println("Return middle character of each elements from below Array");
		for (int index = 0; index < name.length; index++) {
			if (name[index].length() % 2 == 0)
				x = 1;
			else
				x = 0;
			ch[index] = name[index].charAt(name[index].length() / 2 - x);
		}
		return ch;
	}

	public static void main(String[] args) {

		String[] str = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		String[] str1 = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char[] ch = new char[str1.length];
		System.out.println("Middle character of max length String from array is: "
				+ new TestStringArray().getMidCharofMaxString(str));

		System.out.println("---------------------------------------------------------------------------------------");
		ch = new TestStringArray().getMiddCharEachElementArray(str1);
		for (int index = 0; index < str1.length; index++) {
			System.out.println("[" + str1[index] + "] --> [" + ch[index] + "]");

		}

	}

}
