package namratamishra.stringOperations;
/*
Write a method to return even position characters from given String in reverse.
input : technocredits
output : tdrohe
*/

import java.util.Scanner;

class ReturnEvenPositionCharRev

{
	String getEvenCharRev(String str) {
		String even = "", reveven = "";
		for (int index = 1; index <= str.length() - 1; index += 2)
			even = even + str.charAt(index);
		int evenLen = even.length();
		for (int revIndex = evenLen - 1; revIndex >= 0; revIndex--)
			reveven = reveven + even.charAt(revIndex);
		return reveven;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name for finding even position characters in reverse order");
		String name = sc.nextLine();
		System.out.println("Even Position Charaters from the given name: " + name + " is "
				+ new ReturnEvenPositionCharRev().getEvenCharRev(name));
		sc.close();

	}

}